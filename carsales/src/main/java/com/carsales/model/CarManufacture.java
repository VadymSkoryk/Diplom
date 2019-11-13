package com.carsales.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "car_manufacture")
public class CarManufacture {
    private Integer idCarManufacture;
    private String carManufactureName;

    @Id
    @Column(name = "idCar_Manufacture", nullable = false)
    public Integer getIdCarManufacture() {
        return idCarManufacture;
    }

    public void setIdCarManufacture(Integer idCarManufacture) {
        this.idCarManufacture = idCarManufacture;
    }

    @Basic
    @Column(name = "Car_Manufacture_name", nullable = false, length = 45)
    public String getCarManufactureName() {
        return carManufactureName;
    }

    public void setCarManufactureName(String carManufactureName) {
        this.carManufactureName = carManufactureName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarManufacture that = (CarManufacture) o;
        return Objects.equals(idCarManufacture, that.idCarManufacture) &&
                Objects.equals(carManufactureName, that.carManufactureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCarManufacture, carManufactureName);
    }
}
