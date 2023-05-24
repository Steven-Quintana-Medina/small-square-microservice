package com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.adapter;

import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.entity.DishEntity;
import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.exceptions.CategoryNotFoundException;
import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.exceptions.DishNotFoundException;
import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.exceptions.UnauthorizedUserException;
import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.mappers.IDishEntityMapper;
import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.repositories.ICategoryRepository;
import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.repositories.IDishRepository;
import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.repositories.IRestaurantRepository;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Dish;
import com.pragma.powerup.smallsquaremicroservice.domain.spi.IDishPersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DishMysqlAdapter implements IDishPersistencePort {
    private final IDishRepository dishRepository;
    private final IDishEntityMapper dishEntityMapper;
    private final ICategoryRepository categoryRepository;
    private final IRestaurantRepository restaurantRepository;

    @Override
    public void saveDish(Dish dish, Long idUser) {
        restaurantRepository.findByIdAndIdOwner(dish.getIdRestaurant().getId(),idUser).orElseThrow(UnauthorizedUserException::new);
        categoryRepository.findById(dish.getIdCategory().getId()).orElseThrow(CategoryNotFoundException::new);
        dishRepository.save(dishEntityMapper.toEntity(dish));
    }

    @Override
    public void updateDish(Dish dish, Long idUser) {
        DishEntity dishUpdate = dishRepository.findById(dish.getId()).orElseThrow(DishNotFoundException::new);
        if(!dishUpdate.getIdRestaurant().getIdOwner().equals(idUser)){
            throw new UnauthorizedUserException();
        }
        dishUpdate.setPrice(dish.getPrice());
        dishUpdate.setDescription(dish.getDescription());
        dishRepository.save(dishUpdate);
    }
}
