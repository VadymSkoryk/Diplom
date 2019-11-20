package com.carsales.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class City {
    private int idcity;
    private String cityname;
    private int idcountry;
    private Collection<Bill> billsByIdcity;
    private Country countryByIdcountry;

    @Id
    @Column(name = "idcity", nullable = false, insertable = false,updatable = false)
    public int getIdcity() {
        return idcity;
    }

    public void setIdcity(int idcity) {
        this.idcity = idcity;
    }

    @Basic
    @Column(name = "cityname", nullable = false, length = 45)
    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    @Basic
    @Column(name = "idcountry", nullable = false, insertable = false,updatable = false)
    public int getIdcountry() {
        return idcountry;
    }

    public void setIdcountry(int idcountry) {
        this.idcountry = idcountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return idcity == city.idcity &&
                idcountry == city.idcountry &&
                Objects.equals(cityname, city.cityname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcity, cityname, idcountry);
    }

    @OneToMany(mappedBy = "cityByIdcity")
    public Collection<Bill> getBillsByIdcity() {
        return billsByIdcity;
    }

    public void setBillsByIdcity(Collection<Bill> billsByIdcity) {
        this.billsByIdcity = billsByIdcity;
    }

    @ManyToOne
    @JoinColumn(name = "idcountry", referencedColumnName = "idcountry", nullable = false)
    public Country getCountryByIdcountry() {
        return countryByIdcountry;
    }

    public void setCountryByIdcountry(Country countryByIdcountry) {
        this.countryByIdcountry = countryByIdcountry;
    }
}
