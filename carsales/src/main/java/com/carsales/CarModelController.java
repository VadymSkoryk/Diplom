package com.carsales;

import com.carsales.dao.impl.JPACarModelDAO;
import com.carsales.model.CarManufacture;
import com.carsales.model.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class CarModelController {

    @Autowired
    private JPACarModelDAO modelDAO;

    @RequestMapping(value = "/model", method = RequestMethod.GET)
    public String getCountry(Model model) {
        model.addAttribute("model", modelDAO.getAll());
        return "/model";
    }

    @GetMapping("/model/add_model")
    public String getSignUp(Model model){
        model.addAttribute("model",new CarModel());
        return "/add_model";
    }

    @PostMapping("/model/add_model")
    public String sigUp(@ModelAttribute CarModel model, BindingResult result) {

        if(result.hasErrors()){
            return "/add_model";
        }
        modelDAO.add(model);
        return "redirect:/model";
    }

}
