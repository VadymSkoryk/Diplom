package com.carsales;

import com.carsales.dao.impl.JPACarForSaleDAO;
import com.carsales.model.CarForSale;
import com.carsales.model.CarManufacture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class CarForSalesController {

    @Autowired
    private JPACarForSaleDAO saleDAO;

    @RequestMapping(value = "/sale", method = RequestMethod.GET)
    public String getCountry(Model model) {
        model.addAttribute("sale", saleDAO.getAll());
        return "/sale";
    }

    @GetMapping("/sale/add_sale")
    public String getSignUp(Model model){
        model.addAttribute("sale",new CarForSale());
        return "/add_sale";
    }

    @PostMapping("/sale/add_sale")
    public String sigUp(@ModelAttribute CarForSale sale, BindingResult result) {

        if(result.hasErrors()){
            return "/add_sale";
        }
        saleDAO.add(sale);
        return "redirect:/sale";
    }
}
