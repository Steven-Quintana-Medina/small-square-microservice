package com.pragma.powerup.smallsquaremicroservice.domain.datasource;

public interface IUserClientPort {
    boolean getOwner(Long id);

    boolean getEmployee(Long id);
}
