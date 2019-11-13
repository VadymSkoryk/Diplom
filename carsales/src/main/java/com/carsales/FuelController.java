package com.carsales;

import com.carsales.dao.impl.JPAFuelDAO;
import com.carsales.model.FuelType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class FuelController {

    @Autowired
    private JPAFuelDAO fuelDAO;

    @RequestMapping(value = "/fuel", method = RequestMethod.GET)
    public String getUsers(Model model)  {
        model.addAttribute("fueltype", fuelDAO.getAll());
        return "/fuel";
    }

    @GetMapping("/fuel/add_newfuel")
    public String getSignUp(Model model){
        model.addAttribute("fuel",new FuelType());
        return "/add_newfuel";
    }

    @PostMapping("/fuel/add_newfuel")
    public String sigUp(@ModelAttribute FuelType fuel, BindingResult result) {

        if(result.hasErrors()){
            return "/add_newfuel";
        }
        fuelDAO.add(fuel);
        return "redirect:/fuel";
    }
}
