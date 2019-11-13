package com.carsales.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iduser;

    @NotBlank(message = "Name is required")
    @Column(name = "user_name")
    private  String name;

    @NotBlank
    @Size(min=1,max=10, message = "Surname maxLength = 10")
    @Column(name = "user_surname")
    private  String surname;


    @Size(min=8,message = "password couldnt be shorter then 8 symbols")
     private String password;

    @Email
     private  String email;

    @Column(name = "roles_idroles")
    private int idroles;

    public int getIdroles() {
        return idroles;
    }

    public void setIdroles(int idroles) {
        this.idroles = idroles;
    }

    public User() {
    }

    public User(@NotBlank(message = "Name is required") String name, @NotBlank @Size(min = 1, max = 10, message = "Surname maxLength = 10") String surname, @Size(min = 8, message = "password couldnt be shorter then 8 symbols") String password, @Email String email) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.email = email;
    }

    public Long getIduser() {
        return iduser;
    }

    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
