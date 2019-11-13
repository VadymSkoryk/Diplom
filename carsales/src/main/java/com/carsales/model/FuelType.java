package com.carsales.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "fuel_type")
public class FuelType {
    private Integer idFuelType;
    private String fuelTypeName;

    @Id
    @Column(name = "idFuel_type", nullable = false)
    public Integer getIdFuelType() {
        return idFuelType;
    }

    public void setIdFuelType(Integer idFuelType) {
        this.idFuelType = idFuelType;
    }

    @Basic
    @Column(name = "Fuel_type_name", nullable = false, length = 30)
    public String getFuelTypeName() {
        return fuelTypeName;
    }

    public void setFuelTypeName(String fuelTypeName) {
        this.fuelTypeName = fuelTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FuelType fuelType = (FuelType) o;
        return Objects.equals(idFuelType, fuelType.idFuelType) &&
                Objects.equals(fuelTypeName, fuelType.fuelTypeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFuelType, fuelTypeName);
    }
}
