package com.carsales.dao.impl;


import com.carsales.model.CarModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarModelDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.openSession();
    }


    public List<CarModel> getAll(){
        return currentSession().createQuery("from CarModel",CarModel.class).list();
    }

    public List<CarModel> getByManyfacture(int idmanufacture){
        Query q = currentSession().createQuery("from CarModel where idcarManufacture = :param");
        q.setParameter("param",idmanufacture);
        return q.list();
    }

    public void add(CarModel cm){
        currentSession().save(cm);
    }
}
