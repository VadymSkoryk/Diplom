package com.carsales.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Fuel {
    private int idfuel;
    private String fuelname;
    private Collection<Bill> billsByIdfuel;

    @Id
    @Column(name = "idfuel", nullable = false, insertable = false,updatable = false)
    public int getIdfuel() {
        return idfuel;
    }

    public void setIdfuel(int idfuel) {
        this.idfuel = idfuel;
    }

    @Basic
    @Column(name = "fuelname", nullable = false, length = 45)
    public String getFuelname() {
        return fuelname;
    }

    public void setFuelname(String fuelname) {
        this.fuelname = fuelname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fuel fuel = (Fuel) o;
        return idfuel == fuel.idfuel &&
                Objects.equals(fuelname, fuel.fuelname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idfuel, fuelname);
    }

    @OneToMany(mappedBy = "fuelByIdfuel")
    public Collection<Bill> getBillsByIdfuel() {
        return billsByIdfuel;
    }

    public void setBillsByIdfuel(Collection<Bill> billsByIdfuel) {
        this.billsByIdfuel = billsByIdfuel;
    }
}
