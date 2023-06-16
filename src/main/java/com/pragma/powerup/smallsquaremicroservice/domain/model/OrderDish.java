package com.pragma.powerup.smallsquaremicroservice.domain.model;

public class OrderDish {
    private Long id;
    private Order idOrder;
    private Dish idDish;
    private int quantity;

    public OrderDish(Long id, Order idOrder, Dish idDish, int quantity) {
        this.id = id;
        this.idOrder = idOrder;
        this.idDish = idDish;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Order idOrder) {
        this.idOrder = idOrder;
    }

    public Dish getIdDish() {
        return idDish;
    }

    public void setIdDish(Dish idDish) {
        this.idDish = idDish;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
