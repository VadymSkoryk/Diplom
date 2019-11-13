package com.carsales.dao.impl;

import com.carsales.model.CarForSale;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
@Transactional(readOnly = true)
public class JPACarForSaleDAO {
    @PersistenceContext(unitName = "emf")
    private EntityManager entityManager;


    public List<CarForSale> getAll() {
        return entityManager.createQuery("select f from CarForSale f", CarForSale.class).getResultList();
    }

    @Transactional
    public void add(CarForSale sale) {
        entityManager.persist(sale);
    }
}

