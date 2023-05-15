package com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.adapter;

import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.exceptions.NitAlreadyExistsException;
import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.exceptions.PhoneAlreadyExistsException;
import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.mappers.IRestaurantEntityMapper;
import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.repositories.IRestaurantRepository;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Restaurant;
import com.pragma.powerup.smallsquaremicroservice.domain.spi.IRestaurantPersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RestaurantMysqlAdapter implements IRestaurantPersistencePort {
    private final IRestaurantRepository restaurantRepository;
    private final IRestaurantEntityMapper restaurantEntityMapper;
    @Override
    public void saveRestaurant(Restaurant restaurant) {
        if(restaurantRepository.existsByNit(restaurant.getNit())){
            throw new NitAlreadyExistsException();
        }
        if(restaurantRepository.existsByPhone(restaurant.getPhone())){
            throw new PhoneAlreadyExistsException();
        }
        restaurantRepository.save(restaurantEntityMapper.toEntity(restaurant));
    }
}
