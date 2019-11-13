package com.carsales.util;

import com.carsales.dao.UserDAOInt;
import com.carsales.dao.impl.JPAUserDAO;
import com.carsales.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {

    @Autowired
    private UserDAOInt userDAO;

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;
        if(userDAO.getOne(user.getEmail()) != null){
            errors.rejectValue("email","","This email is already in use");
        }
    }
}
