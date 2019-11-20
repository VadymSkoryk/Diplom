package com.carsales.controller;


import com.carsales.dao.impl.UserDAO;
import com.carsales.model.Role;
import com.carsales.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserDAO userDAO;

    @GetMapping("/userList")
    public String getRoles(Model model){
        model.addAttribute("users",userDAO.getAll());
        return "/userList";
    }

    @GetMapping("/user/new")
    public String getAddUser(Model model){
        model.addAttribute("user",new User());
        return "/userAdd";
    }

    @PostMapping("/user/new")
    public String addUser(@ModelAttribute User user){
        userDAO.add(user);
        return "redirect:/userList";
    }
}
