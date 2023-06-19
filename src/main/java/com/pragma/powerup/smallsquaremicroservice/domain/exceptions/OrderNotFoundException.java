package com.pragma.powerup.smallsquaremicroservice.domain.exceptions;

public class OrderNotFoundException extends RuntimeException {
    private final Long idOrder;

    public OrderNotFoundException(Long idOrder) {
        super();
        this.idOrder = idOrder;
    }

    public Long getIdOrder() {
        return idOrder;
    }
}
