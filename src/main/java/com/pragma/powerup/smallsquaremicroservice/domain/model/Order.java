package com.pragma.powerup.smallsquaremicroservice.domain.model;

import com.pragma.powerup.smallsquaremicroservice.domain.enums.EnumStatusOrder;

import java.util.Date;
import java.util.List;

public class Order {
    private Long id;
    private Date date;
    private EnumStatusOrder status;
    private Long idClient;
    private Long idChef;
    private Restaurant idRestaurant;

    private List<OrderDish> orderDishes;

    public Order(Long id, Date date, EnumStatusOrder status, Long idClient, Long idChef, Restaurant restaurant, List<OrderDish> orderDishes) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.idClient = idClient;
        this.idChef = idChef;
        idRestaurant = restaurant;
        this.orderDishes = orderDishes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public EnumStatusOrder getStatus() {
        return status;
    }

    public void setStatus(EnumStatusOrder status) {
        this.status = status;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public Long getIdChef() {
        return idChef;
    }

    public void setIdChef(Long idChef) {
        this.idChef = idChef;
    }

    public Restaurant getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(Restaurant idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public List<OrderDish> getOrderDishes() {
        return orderDishes;
    }

    public void setOrderDishes(List<OrderDish> orderDishes) {
        this.orderDishes = orderDishes;
    }
}
