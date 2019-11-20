package com.carsales.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "car_model", schema = "carsales")
public class CarModel {
    private int idcarModel;
    private String modelName;
    private int idcarManufacture;
    private Collection<Bill> billsByIdcarModel;
    private CarManufacture carManufactureByIdcarManufacture;

    @Id
    @Column(name = "idcar_model", nullable = false, insertable = false,updatable = false)
    public int getIdcarModel() {
        return idcarModel;
    }

    public void setIdcarModel(int idcarModel) {
        this.idcarModel = idcarModel;
    }

    @Basic
    @Column(name = "model_name", nullable = false, length = 45)
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Basic
    @Column(name = "idcar_manufacture", nullable = false)
    public int getIdcarManufacture() {
        return idcarManufacture;
    }

    public void setIdcarManufacture(int idcarManufacture) {
        this.idcarManufacture = idcarManufacture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarModel carModel = (CarModel) o;
        return idcarModel == carModel.idcarModel &&
                idcarManufacture == carModel.idcarManufacture &&
                Objects.equals(modelName, carModel.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcarModel, modelName, idcarManufacture);
    }

    @OneToMany(mappedBy = "carModelByIdmodel")
    public Collection<Bill> getBillsByIdcarModel() {
        return billsByIdcarModel;
    }

    public void setBillsByIdcarModel(Collection<Bill> billsByIdcarModel) {
        this.billsByIdcarModel = billsByIdcarModel;
    }

    @ManyToOne
    @JoinColumn(name = "idcar_manufacture", referencedColumnName = "idcar_manufacture", nullable = false, insertable = false,updatable = false)
    public CarManufacture getCarManufactureByIdcarManufacture() {
        return carManufactureByIdcarManufacture;
    }

    public void setCarManufactureByIdcarManufacture(CarManufacture carManufactureByIdcarManufacture) {
        this.carManufactureByIdcarManufacture = carManufactureByIdcarManufacture;
    }
}
