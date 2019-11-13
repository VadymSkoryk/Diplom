package com.carsales;

import com.carsales.dao.impl.JPACarManufactureDAO;
import com.carsales.model.CarManufacture;
import com.carsales.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class CarManufactureController {

    @Autowired
    private JPACarManufactureDAO carmDAO;

    @RequestMapping(value = "/car", method = RequestMethod.GET)
    public String getCountry(Model model) {
        model.addAttribute("car", carmDAO.getAll());
        return "/car";
    }

    @GetMapping("/car/add_carm")
    public String getSignUp(Model model){
        model.addAttribute("carm",new CarManufacture());
        return "/add_carm";
    }

    @PostMapping("/car/add_carm")
    public String sigUp(@ModelAttribute CarManufacture carm, BindingResult result) {

        if(result.hasErrors()){
            return "/add_carm";
        }
        carmDAO.add(carm);
        return "redirect:/car";
    }
}
