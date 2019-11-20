package com.carsales.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String view( Model model){
        model.addAttribute("msg","Welcome to our Website");
        return "/index";
    }

}
