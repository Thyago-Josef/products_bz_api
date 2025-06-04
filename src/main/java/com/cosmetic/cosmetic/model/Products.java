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
    private String category;
    private String description;
    private String image;
    private int pontuation;
    private String barcode;

    private String email;


    public Products(Long idProduct, String name, String category, String description, String image, int pontuation, String barcode) {
        this.idProduct = idProduct;
        this.name = name;
        this.category = category;
        this.description = description;
        this.image = image;
        this.pontuation = pontuation;
        this.barcode = barcode;
    }

    public Products(Long idProduct, String name, String category, String description, String image, int pontuation, String barcode, String email) {
        this.idProduct = idProduct;
        this.name = name;
        this.category = category;
        this.description = description;
        this.image = image;
        this.pontuation = pontuation;
        this.barcode = barcode;
        this.email = email;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
    public void setImage(String image) {
        this.image = image;
    }

    public int getPontuation() {
        return pontuation;
    }

    public void setPontuation(int pontuation) {
        this.pontuation = pontuation;
    }


    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {


    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
