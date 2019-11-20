package com.carsales.controller;


import com.carsales.dao.impl.BillDAO;
import com.carsales.model.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.ManyToOne;

@Controller
public class BillController {

    @Autowired
    BillDAO billDAO;

    @GetMapping("/billList")
    public String getBills(Model model){
        model.addAttribute("bills",billDAO.getAll());
        return "/billList";
    }

    @GetMapping("/bill/new")
    public String getAddBill(Model model){
        model.addAttribute("bill",new Bill());
        return "/addBill";
    }

    @PostMapping("/bill/new")
    public String addBill(@ModelAttribute Bill bill){
        billDAO.add(bill);
        return "redirect:/";
    }

}
