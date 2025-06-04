package com.cosmetic.cosmetic.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Users {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long idUSer;
    private String googleId;
    private String name;
    private String email;
    private String password;

    private String plano; // EX: "BÁSICO", "PREMIUM"
    private LocalDate ativoAte; // data até a qual o plano está ativo

    private String role;

//    @ManyToMany
//    @JoinTable(
//            name = "users_roles",
//            joinColumns = @JoinColumn(name="idUser"),
//            inverseJoinColumns = @JoinColumn(name="roleId")
//    )
//
//    private Set<Role> roles;


    public Users(Long idUSer, String googleId, String name, String email, String password, String plano, LocalDate ativoAte, String role) {
        this.idUSer = idUSer;
        this.googleId = googleId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.plano = plano;
        this.ativoAte = ativoAte;
        this.role = role;
    }

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


    public String getGoogleId() {
        return googleId;
    }

    public void setGoogleId(String googleId) {
        this.googleId = googleId;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public LocalDate getAtivoAte() {
        return ativoAte;
    }

    public void setAtivoAte(LocalDate ativoAte) {
        this.ativoAte = ativoAte;
    }

    public enum values{

        ROLE_ADMIN(1L),
        ROLE_USER(2L);

        long roleId;


        values(Long roleId){
            this.roleId = roleId;
        }

        public long getRoleId() {
            return roleId;
        }
    }
}
