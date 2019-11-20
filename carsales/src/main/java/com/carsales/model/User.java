package com.carsales.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class User {
    private int iduser;
    private String username;
    private String userSurname;
    private String email;
    private String password;
    private int idrole;
    private Collection<Bill> billsByIduser;
    private Role roleByIdrole;

    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser", nullable = false,insertable=false, updatable=false)
    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 15)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "user_surname", nullable = false, length = 15)
    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @PrePersist
    public void prePersist(){
        if(idrole==0)
            idrole=2;
    }

    @Basic
    @Column(name = "idrole", nullable = false)
    public int getIdrole() {
        return idrole;
    }

    public void setIdrole(int idrole) {
        this.idrole = 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return iduser == user.iduser &&
                idrole == user.idrole &&
                Objects.equals(username, user.username) &&
                Objects.equals(userSurname, user.userSurname) &&
                Objects.equals(email, user.email) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iduser, username, userSurname, email, password, idrole);
    }

    @OneToMany(mappedBy = "userByIduser")
    public Collection<Bill> getBillsByIduser() {
        return billsByIduser;
    }

    public void setBillsByIduser(Collection<Bill> billsByIduser) {
        this.billsByIduser = billsByIduser;
    }

    @ManyToOne
    @JoinColumn(name = "idrole", referencedColumnName = "idrole", nullable = false, insertable = false,updatable = false)
    @org.hibernate.annotations.ForeignKey(name = "user_role")
    public Role getRoleByIdrole() {
        return roleByIdrole;
    }

    public void setRoleByIdrole(Role roleByIdrole) {
        this.roleByIdrole = roleByIdrole;
    }
}
