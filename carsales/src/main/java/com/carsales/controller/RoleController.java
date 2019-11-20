package com.carsales.controller;

import com.carsales.dao.impl.RoleDAO;
import com.carsales.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RoleController {

    @Autowired
    private RoleDAO roleDAO;

    @GetMapping("/role")
    public String getRoles(Model model){
    model.addAttribute("roles",roleDAO.getAll());
    return "/role";
    }

    @GetMapping("/role/new")
    public String getAddRole(Model model){
        model.addAttribute("role",new Role());
        return "/roleadd";
    }

    @PostMapping("/role/new")
    public String addRole(@ModelAttribute Role role){
        roleDAO.add(role);
        return "redirect:/role";
    }

}
