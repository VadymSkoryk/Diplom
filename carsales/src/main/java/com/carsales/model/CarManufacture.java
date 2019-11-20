package com.carsales.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "car_manufacture", schema = "carsales", catalog = "")
public class CarManufacture {
    private int idcarManufacture;
    private String manufacturename;
    private Collection<Bill> billsByIdcarManufacture;
    private Collection<CarModel> carModelsByIdcarManufacture;

    @Id
    @Column(name = "idcar_manufacture", nullable = false, insertable = false,updatable = false)
    public int getIdcarManufacture() {
        return idcarManufacture;
    }

    public void setIdcarManufacture(int idcarManufacture) {
        this.idcarManufacture = idcarManufacture;
    }

    @Basic
    @Column(name = "manufacturename", nullable = false, length = 45)
    public String getManufacturename() {
        return manufacturename;
    }

    public void setManufacturename(String manufacturename) {
        this.manufacturename = manufacturename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarManufacture that = (CarManufacture) o;
        return idcarManufacture == that.idcarManufacture &&
                Objects.equals(manufacturename, that.manufacturename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcarManufacture, manufacturename);
    }

    @OneToMany(mappedBy = "carManufactureByIdmanufacture")
    public Collection<Bill> getBillsByIdcarManufacture() {
        return billsByIdcarManufacture;
    }

    public void setBillsByIdcarManufacture(Collection<Bill> billsByIdcarManufacture) {
        this.billsByIdcarManufacture = billsByIdcarManufacture;
    }

    @OneToMany(mappedBy = "carManufactureByIdcarManufacture")
    public Collection<CarModel> getCarModelsByIdcarManufacture() {
        return carModelsByIdcarManufacture;
    }

    public void setCarModelsByIdcarManufacture(Collection<CarModel> carModelsByIdcarManufacture) {
        this.carModelsByIdcarManufacture = carModelsByIdcarManufacture;
    }
}
