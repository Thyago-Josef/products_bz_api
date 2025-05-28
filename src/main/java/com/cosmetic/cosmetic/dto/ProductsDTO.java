package com.cosmetic.cosmetic.dto;



public class ProductsDTO {

    private Long idProduct;
    private String name;
    private String description;
    private String image;
    private int pontuation;

    public ProductsDTO(Long idProduct, String name, String description, String image, int pontuation) {
        this.idProduct = idProduct;
        this.name = name;
        this.description = description;
        this.image = image;
        this.pontuation = pontuation;
    }

    public ProductsDTO() {
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

    public void setImage(String image) {
        this.image = image;
    }

    public int getPontuation() {
        return pontuation;
    }

    public void setPontuation(int pontuation) {
        this.pontuation = pontuation;
    }
}
