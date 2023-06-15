package com.pragma.powerup.smallsquaremicroservice.domain.spi;

import com.pragma.powerup.smallsquaremicroservice.domain.model.RestaurantEmployee;

public interface IRestaurantEmployeePersistencePort {
    void assignRestaurantEmployee(RestaurantEmployee restaurantEmployee, Long idOwner);
}
