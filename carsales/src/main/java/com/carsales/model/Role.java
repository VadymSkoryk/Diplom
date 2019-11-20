package com.carsales.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "role")
public class Role {
    private int idrole;
    private String rolename;
    private Collection<User> usersByIdrole;

    public Role() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrole", nullable = false, insertable = false,updatable = false)
    public int getIdrole() {
        return idrole;
    }

    public void setIdrole(int idrole) {
        this.idrole = idrole;
    }

    @Basic
    @Column(name = "rolename", nullable = false, length = 10)
    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return idrole == role.idrole &&
                Objects.equals(rolename, role.rolename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idrole, rolename);
    }

    @OneToMany(mappedBy = "roleByIdrole")
    public Collection<User> getUsersByIdrole() {
        return usersByIdrole;
    }

    public void setUsersByIdrole(Collection<User> usersByIdrole) {
        this.usersByIdrole = usersByIdrole;
    }
}
