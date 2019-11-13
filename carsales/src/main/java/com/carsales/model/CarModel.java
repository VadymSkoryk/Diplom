package com.carsales.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "car_model")
public class CarModel {
    private Integer idCarModel;
    private String carModelName;

    @Id
    @Column(name = "idCar_Model", nullable = false)
    public Integer getIdCarModel() {
        return idCarModel;
    }

    public void setIdCarModel(Integer idCarModel) {
        this.idCarModel = idCarModel;
    }

    @Basic
    @Column(name = "Car_Model_name", nullable = false, length = 30)
    public String getCarModelName() {
        return carModelName;
    }

    public void setCarModelName(String carModelName) {
        this.carModelName = carModelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarModel carModel = (CarModel) o;
        return Objects.equals(idCarModel, carModel.idCarModel) &&
                Objects.equals(carModelName, carModel.carModelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCarModel, carModelName);
    }
}
