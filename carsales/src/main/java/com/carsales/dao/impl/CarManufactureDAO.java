package com.carsales.dao.impl;


import com.carsales.model.CarManufacture;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarManufactureDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.openSession();
    }


    public List<CarManufacture> getAll(){
        return currentSession().createQuery("from CarManufacture ",CarManufacture.class).list();
    }

    public void add(CarManufacture cm){
        currentSession().save(cm);
    }

}
