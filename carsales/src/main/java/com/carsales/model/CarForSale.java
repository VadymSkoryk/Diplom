package com.carsales.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "car_for_sale")
public class CarForSale {
    private Integer idCarForSale;
    private Integer price;
    private Date registrationYear;

    @Id
    @Column(name = "idCar_For_Sale", nullable = false)
    public Integer getIdCarForSale() {
        return idCarForSale;
    }

    public void setIdCarForSale(Integer idCarForSale) {
        this.idCarForSale = idCarForSale;
    }

    @Basic
    @Column(name = "price", nullable = false)
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "Registration_year", nullable = false)
    public Date getRegistrationYear() {
        return registrationYear;
    }

    public void setRegistrationYear(Date registrationYear) {
        this.registrationYear = registrationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarForSale that = (CarForSale) o;
        return Objects.equals(idCarForSale, that.idCarForSale) &&
                Objects.equals(price, that.price) &&
                Objects.equals(registrationYear, that.registrationYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCarForSale, price, registrationYear);
    }
}
