package com.carsales.dao.impl;


import com.carsales.model.FuelType;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
@Transactional(readOnly = true)
public class JPAFuelDAO {

    @PersistenceContext(unitName = "emf")
    private EntityManager entityManager;


    public List<FuelType> getAll() {
        return entityManager.createQuery("select f from FuelType f", FuelType.class).getResultList();
    }

    @Transactional
    public void add(FuelType fuelType) {
        entityManager.persist(fuelType);
    }
}
