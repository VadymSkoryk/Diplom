package com.carsales.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Country {
    private int idcountry;
    private String countryname;
    private Collection<Bill> billsByIdcountry;
    private Collection<City> citiesByIdcountry;

    @Id
    @Column(name = "idcountry", nullable = false, insertable = false,updatable = false)
    public int getIdcountry() {
        return idcountry;
    }

    public void setIdcountry(int idcountry) {
        this.idcountry = idcountry;
    }

    @Basic
    @Column(name = "countryname", nullable = false, length = 45)
    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return idcountry == country.idcountry &&
                Objects.equals(countryname, country.countryname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcountry, countryname);
    }

    @OneToMany(mappedBy = "countryByIdcountry")
    public Collection<Bill> getBillsByIdcountry() {
        return billsByIdcountry;
    }

    public void setBillsByIdcountry(Collection<Bill> billsByIdcountry) {
        this.billsByIdcountry = billsByIdcountry;
    }

    @OneToMany(mappedBy = "countryByIdcountry")
    public Collection<City> getCitiesByIdcountry() {
        return citiesByIdcountry;
    }

    public void setCitiesByIdcountry(Collection<City> citiesByIdcountry) {
        this.citiesByIdcountry = citiesByIdcountry;
    }
}
