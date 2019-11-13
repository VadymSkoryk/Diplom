package com.carsales;

import com.carsales.dao.impl.JPACountryDAO;
import com.carsales.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class CountryController {

    @Autowired
    private JPACountryDAO countryDAO;

    @RequestMapping(value = "/country", method = RequestMethod.GET)
    public String getCountry(Model model) {
        model.addAttribute("country", countryDAO.getAll());
        return "/country";
    }

    @GetMapping("/country/add_country")
    public String getSignUp(Model model){
        model.addAttribute("country",new Country());
        return "/add_country";
    }

    @PostMapping("/country/add_country")
    public String sigUp(@ModelAttribute Country country, BindingResult result) {

        if(result.hasErrors()){
            return "/add_country";
        }
        countryDAO.add(country);
        return "redirect:/country";
    }
}
