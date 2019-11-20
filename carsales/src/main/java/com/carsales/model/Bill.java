package com.carsales.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Bill {
    private int idbill;
    private int idmanufacture;
    private int idmodel;
    private int idcountry;
    private int idcity;
    private int idfuel;
    private int idtransmission;
    private double vEngine;
    private int distance;
    private int price;
    private Date year;
    private int iduser;
    private CarManufacture carManufactureByIdmanufacture;
    private CarModel carModelByIdmodel;
    private Country countryByIdcountry;
    private City cityByIdcity;
    private Fuel fuelByIdfuel;
    private Transmission transmissionByIdtransmission;
    private User userByIduser;

    @Id
    @Column(name = "idbill", nullable = false, insertable = false,updatable = false)
    public int getIdbill() {
        return idbill;
    }

    public void setIdbill(int idbill) {
        this.idbill = idbill;
    }

    @Basic
    @Column(name = "idmanufacture", nullable = false, insertable = false,updatable = false)
    public int getIdmanufacture() {
        return idmanufacture;
    }

    public void setIdmanufacture(int idmanufacture) {
        this.idmanufacture = idmanufacture;
    }

    @Basic
    @Column(name = "idmodel", nullable = false, insertable = false,updatable = false)
    public int getIdmodel() {
        return idmodel;
    }

    public void setIdmodel(int idmodel) {
        this.idmodel = idmodel;
    }

    @Basic
    @Column(name = "idcountry", nullable = false, insertable = false,updatable = false)
    public int getIdcountry() {
        return idcountry;
    }

    public void setIdcountry(int idcountry) {
        this.idcountry = idcountry;
    }

    @Basic
    @Column(name = "idcity", nullable = false, insertable = false,updatable = false)
    public int getIdcity() {
        return idcity;
    }

    public void setIdcity(int idcity) {
        this.idcity = idcity;
    }

    @Basic
    @Column(name = "idfuel", nullable = false, insertable = false,updatable = false)
    public int getIdfuel() {
        return idfuel;
    }

    public void setIdfuel(int idfuel) {
        this.idfuel = idfuel;
    }

    @Basic
    @Column(name = "idtransmission", nullable = false, insertable = false,updatable = false)
    public int getIdtransmission() {
        return idtransmission;
    }

    public void setIdtransmission(int idtransmission) {
        this.idtransmission = idtransmission;
    }

    @Basic
    @Column(name = "v_engine", nullable = false, insertable = false,updatable = false)
    public double getvEngine() {
        return vEngine;
    }

    public void setvEngine(double vEngine) {
        this.vEngine = vEngine;
    }

    @Basic
    @Column(name = "distance", nullable = false)
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Basic
    @Column(name = "price", nullable = false)
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @Column(name = "year", nullable = false)
    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    @Basic
    @Column(name = "iduser", nullable = false, insertable = false,updatable = false)
    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill bill = (Bill) o;
        return idbill == bill.idbill &&
                idmanufacture == bill.idmanufacture &&
                idmodel == bill.idmodel &&
                idcountry == bill.idcountry &&
                idcity == bill.idcity &&
                idfuel == bill.idfuel &&
                idtransmission == bill.idtransmission &&
                Double.compare(bill.vEngine, vEngine) == 0 &&
                distance == bill.distance &&
                price == bill.price &&
                iduser == bill.iduser &&
                Objects.equals(year, bill.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idbill, idmanufacture, idmodel, idcountry, idcity, idfuel, idtransmission, vEngine, distance, price, year, iduser);
    }

    @ManyToOne
    @JoinColumn(name = "idmanufacture", referencedColumnName = "idcar_manufacture", nullable = false)
    public CarManufacture getCarManufactureByIdmanufacture() {
        return carManufactureByIdmanufacture;
    }

    public void setCarManufactureByIdmanufacture(CarManufacture carManufactureByIdmanufacture) {
        this.carManufactureByIdmanufacture = carManufactureByIdmanufacture;
    }

    @ManyToOne
    @JoinColumn(name = "idmodel", referencedColumnName = "idcar_model", nullable = false)
    public CarModel getCarModelByIdmodel() {
        return carModelByIdmodel;
    }

    public void setCarModelByIdmodel(CarModel carModelByIdmodel) {
        this.carModelByIdmodel = carModelByIdmodel;
    }

    @ManyToOne
    @JoinColumn(name = "idcountry", referencedColumnName = "idcountry", nullable = false)
    public Country getCountryByIdcountry() {
        return countryByIdcountry;
    }

    public void setCountryByIdcountry(Country countryByIdcountry) {
        this.countryByIdcountry = countryByIdcountry;
    }

    @ManyToOne
    @JoinColumn(name = "idcity", referencedColumnName = "idcity", nullable = false)
    public City getCityByIdcity() {
        return cityByIdcity;
    }

    public void setCityByIdcity(City cityByIdcity) {
        this.cityByIdcity = cityByIdcity;
    }

    @ManyToOne
    @JoinColumn(name = "idfuel", referencedColumnName = "idfuel", nullable = false)
    public Fuel getFuelByIdfuel() {
        return fuelByIdfuel;
    }

    public void setFuelByIdfuel(Fuel fuelByIdfuel) {
        this.fuelByIdfuel = fuelByIdfuel;
    }

    @ManyToOne
    @JoinColumn(name = "idtransmission", referencedColumnName = "idtransmission", nullable = false)
    public Transmission getTransmissionByIdtransmission() {
        return transmissionByIdtransmission;
    }

    public void setTransmissionByIdtransmission(Transmission transmissionByIdtransmission) {
        this.transmissionByIdtransmission = transmissionByIdtransmission;
    }

    @ManyToOne
    @JoinColumn(name = "iduser", referencedColumnName = "iduser", nullable = false)
    public User getUserByIduser() {
        return userByIduser;
    }

    public void setUserByIduser(User userByIduser) {
        this.userByIduser = userByIduser;
    }
}
