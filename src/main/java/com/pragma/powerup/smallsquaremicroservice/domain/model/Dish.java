package com.pragma.powerup.smallsquaremicroservice.domain.model;

public class Dish {
    private Long id;
    private String name;
    private double price;
    private String description;
    private String urlImage;
    private Category idCategory;
    private Restaurant idRestaurant;
    private boolean status;

    public Dish() {
    }

    public Dish(String name, double price, String description, String urlImage, Category idCategory, Restaurant idRestaurant, boolean status) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.urlImage = urlImage;
        this.idCategory = idCategory;
        this.idRestaurant = idRestaurant;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public Category getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Category idCategory) {
        this.idCategory = idCategory;
    }

    public Restaurant getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(Restaurant idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
