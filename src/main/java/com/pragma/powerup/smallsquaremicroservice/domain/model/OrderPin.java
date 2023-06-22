package com.pragma.powerup.smallsquaremicroservice.domain.model;

public class OrderPin {
    private Long id;
    private Order idOrder;
    private String pin;

    public OrderPin(Long id, Order idOrder, String pin) {
        this.id = id;
        this.idOrder = idOrder;
        this.pin = pin;
    }

    public OrderPin(Order idOrder, String pin) {
        this.idOrder = idOrder;
        this.pin = pin;
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

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
