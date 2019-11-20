package com.carsales.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Transmission {
    private int idtransmission;
    private String transmissionname;
    private Collection<Bill> billsByIdtransmission;

    @Id
    @Column(name = "idtransmission", nullable = false, insertable = false,updatable = false)
    public int getIdtransmission() {
        return idtransmission;
    }

    public void setIdtransmission(int idtransmission) {
        this.idtransmission = idtransmission;
    }

    @Basic
    @Column(name = "transmissionname", nullable = false, length = 45)
    public String getTransmissionname() {
        return transmissionname;
    }

    public void setTransmissionname(String transmissionname) {
        this.transmissionname = transmissionname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transmission that = (Transmission) o;
        return idtransmission == that.idtransmission &&
                Objects.equals(transmissionname, that.transmissionname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idtransmission, transmissionname);
    }

    @OneToMany(mappedBy = "transmissionByIdtransmission")
    public Collection<Bill> getBillsByIdtransmission() {
        return billsByIdtransmission;
    }

    public void setBillsByIdtransmission(Collection<Bill> billsByIdtransmission) {
        this.billsByIdtransmission = billsByIdtransmission;
    }
}
