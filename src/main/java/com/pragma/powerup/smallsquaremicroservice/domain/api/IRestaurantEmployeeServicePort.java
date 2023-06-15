package com.pragma.powerup.smallsquaremicroservice.domain.api;

import com.pragma.powerup.smallsquaremicroservice.domain.model.RestaurantEmployee;

public interface IRestaurantEmployeeServicePort {
    void assignRestaurantEmployee(RestaurantEmployee restaurantEmployee, Long idOwner);
}
