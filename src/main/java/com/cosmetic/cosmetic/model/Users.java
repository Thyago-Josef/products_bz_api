package com.cosmetic.cosmetic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long idUSer;
    private String name;
    private String email;
    private String password;
    private String role;


    public Users(Long idUSer, String name, String email, String password, String role) {
        this.idUSer = idUSer;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Users() {

    }

    public Long getIdUSer() {
        return idUSer;
    }

    public void setIdUSer(Long idUSer) {
        this.idUSer = idUSer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
