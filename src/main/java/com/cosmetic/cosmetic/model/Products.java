package com.cosmetic.cosmetic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduct;
    private String name;
    private String description;
    private String image;
    private int pontuation;

    public Products(Long idProduct, String name, String description, String image, int pontuation) {
        this.idProduct = idProduct;
        this.name = name;
        this.description = description;
        this.image = image;
        this.pontuation = pontuation;
    }

    public Products() {

    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;


    }

}
