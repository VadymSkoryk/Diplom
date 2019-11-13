package com.carsales;


import com.carsales.dao.impl.JPACityDAO;
import com.carsales.model.City;
import com.carsales.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class CityController {

    @Autowired
    private JPACityDAO cityDAO;

    @RequestMapping(value = "/city", method = RequestMethod.GET)
    public String getCountry(Model model) {
        model.addAttribute("city", cityDAO.getAll());
        return "/city";
    }

    @GetMapping("/city/add_city")
    public String getSignUp(Model model){
        model.addAttribute("city",new City());
        return "/add_city";
    }

    @PostMapping("/city/add_city")
    public String sigUp(@ModelAttribute City city, BindingResult result) {

        if(result.hasErrors()){
            return "/add_city";
        }
        cityDAO.add(city);
        return "redirect:/country";
    }



}
