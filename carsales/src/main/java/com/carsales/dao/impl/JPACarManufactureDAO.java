package com.carsales.dao.impl;

import com.carsales.model.CarManufacture;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
@Transactional(readOnly = true)
public class JPACarManufactureDAO {

    @PersistenceContext(unitName = "emf")
    private EntityManager entityManager;


    public List<CarManufacture> getAll() {
        return entityManager.createQuery("select f from CarManufacture f", CarManufacture.class).getResultList();
    }

    @Transactional
    public void add(CarManufacture carm) {
        entityManager.persist(carm);
    }
}
