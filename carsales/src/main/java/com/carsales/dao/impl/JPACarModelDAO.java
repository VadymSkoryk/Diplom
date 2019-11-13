package com.carsales.dao.impl;


import com.carsales.model.CarModel;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Component
@Transactional(readOnly=true)
public class JPACarModelDAO {

    @PersistenceContext(unitName = "emf")
    private EntityManager entityManager;


    public List<CarModel> getAll() {
        return entityManager.createQuery("select f from CarModel f", CarModel.class).getResultList();
    }

    @Transactional
    public void add(CarModel carModel) {
        entityManager.persist(carModel);
    }
}
