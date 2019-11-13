package com.carsales;

import com.carsales.dao.impl.JPATransmissionDAO;
import com.carsales.model.TransmissionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import sun.misc.Contended;

@Controller
public class TransmissionController {

    @Autowired
    JPATransmissionDAO transmissionDAO;

    @RequestMapping(value = "/trans", method = RequestMethod.GET)
    public String getUsers(Model model)  {
        model.addAttribute("transmissiontype", transmissionDAO.getAll());
        return "/trans";
    }

    @GetMapping("/trans/trans_add")
    public String getSignUp(Model model){
        model.addAttribute("tt",new TransmissionType());
        return "/trans_add";
    }

    @PostMapping("/trans/trans_add")
    public String sigUp(@ModelAttribute TransmissionType tt, BindingResult result) {

        if(result.hasErrors()){
            return "/trans_add";
        }
        transmissionDAO.add(tt);
        return "redirect:/trans";
    }
}
