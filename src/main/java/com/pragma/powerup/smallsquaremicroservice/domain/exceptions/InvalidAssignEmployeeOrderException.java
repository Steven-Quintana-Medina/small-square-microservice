package com.pragma.powerup.smallsquaremicroservice.domain.exceptions;

public class InvalidAssignEmployeeOrderException extends RuntimeException {
    private final Long idOrder;

    public InvalidAssignEmployeeOrderException(Long idOrder) {
        super();
        this.idOrder = idOrder;
    }

    public Long getIdOrder() {
        return idOrder;
    }
}
