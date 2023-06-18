package com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.adapter;

import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.entity.RestaurantEmployeeEntity;
import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.exceptions.UnauthorizedUserException;
import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.mappers.IRestaurantEmployeeEntityMapper;
import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.repositories.IRestaurantEmployeeRepository;
import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.repositories.IRestaurantRepository;
import com.pragma.powerup.smallsquaremicroservice.domain.model.RestaurantEmployee;
import com.pragma.powerup.smallsquaremicroservice.domain.spi.IRestaurantEmployeePersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RestaurantEmployeeMysqlAdapter implements IRestaurantEmployeePersistencePort {
    private final IRestaurantRepository restaurantRepository;
    private final IRestaurantEmployeeRepository restaurantEmployeeRepository;
    private final IRestaurantEmployeeEntityMapper restaurantEmployeeEntityMapper;

    @Override
    public void assignRestaurantEmployee(RestaurantEmployee restaurantEmployee, Long idOwner) {
        restaurantRepository.findByIdAndIdOwner(restaurantEmployee.getIdRestaurant().getId(), idOwner).orElseThrow(UnauthorizedUserException::new);
        restaurantEmployeeRepository.save(restaurantEmployeeEntityMapper.toEntity(restaurantEmployee));

    }

    @Override
    public RestaurantEmployee getRestaurantEmployee(Long id) {
        RestaurantEmployeeEntity restaurantEmployee = restaurantEmployeeRepository.findByIdEmployee(id).orElseThrow(UnauthorizedUserException::new);
        return restaurantEmployeeEntityMapper.toRestaurantEmployee(restaurantEmployee);
    }
}