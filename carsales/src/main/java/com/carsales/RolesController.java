package com.carsales;


import com.carsales.dao.impl.JPARolesDAO;
import com.carsales.model.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class RolesController {
    @Autowired
    private JPARolesDAO role;

//    @GetMapping("/")
//    public String view( Model model){
//        model.addAttribute("msg","Welcome to our Website");
//        return "index";
//    }

//    @GetMapping("/raw")
//    @ResponseBody
//    public String raw(){
//        return "Rawing.";
//    }

    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    public String getUsers(Model model)  {
        model.addAttribute("roles", role.getAll());
        return "/roles";
    }

    @GetMapping("/roles/add_newrole")
    public String getSignUp(Model model){
        model.addAttribute("roles",new Roles());
        return "/add_newrole";
    }

    @PostMapping("/roles/add_newrole")
    public String sigUp(@ModelAttribute Roles roles, BindingResult result) {

        if(result.hasErrors()){
            return "/add_newrole";
        }
        role.add(roles);
        return "redirect:/roles";
    }
}
