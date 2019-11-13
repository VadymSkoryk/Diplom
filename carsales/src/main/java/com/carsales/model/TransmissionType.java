package com.carsales.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "transmission_type")
public class TransmissionType {
    private Integer idTransmissionType;
    private String transmissionTypeName;

    @Id
    @Column(name = "idTransmission_type", nullable = false)
    public Integer getIdTransmissionType() {
        return idTransmissionType;
    }

    public void setIdTransmissionType(Integer idTransmissionType) {
        this.idTransmissionType = idTransmissionType;
    }

    @Basic
    @Column(name = "Transmission_type_name", nullable = false, length = 45)
    public String getTransmissionTypeName() {
        return transmissionTypeName;
    }

    public void setTransmissionTypeName(String transmissionTypeName) {
        this.transmissionTypeName = transmissionTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransmissionType that = (TransmissionType) o;
        return Objects.equals(idTransmissionType, that.idTransmissionType) &&
                Objects.equals(transmissionTypeName, that.transmissionTypeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTransmissionType, transmissionTypeName);
    }
}
