package com.carsales;

import com.carsales.dao.UserDAOInt;
import com.carsales.dao.impl.JPAUserDAO;
import com.carsales.model.User;
import com.carsales.util.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class MainController {

    @Autowired
    private UserDAOInt userDAO;

    @Autowired
    private UserValidator userValidator;

    @GetMapping("/")
    public String view( Model model){
        model.addAttribute("msg","Welcome to our Website");
        return "index";
    }

    @GetMapping("/raw")
    @ResponseBody
    public String raw(){
        return "Rawing.";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getUsers(Model model)  {
        model.addAttribute("users", userDAO.getAll());
        return "/users";
    }

    @GetMapping("/users/new")
    public String getSignUp(Model model){
        model.addAttribute("user",new User());
        return "/sign_up";
    }

    @PostMapping("/users/new")
    public String sigUp(@ModelAttribute @Valid User user, BindingResult result) {
        userValidator.validate(user,result);
        if(result.hasErrors()){
            return "/sign_up";
        }
        userDAO.add(user);
        return "redirect:/users";
    }

}
