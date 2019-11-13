package com.carsales.dao;

import com.carsales.model.User;

import java.util.List;

public interface UserDAOInt {
    List<User> getAll();
    
    User getOne(String email);
    
    void add(User user);
}
