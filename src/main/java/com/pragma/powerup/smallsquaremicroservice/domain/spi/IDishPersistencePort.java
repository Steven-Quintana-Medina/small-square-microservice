package com.pragma.powerup.smallsquaremicroservice.domain.spi;


import com.pragma.powerup.smallsquaremicroservice.domain.model.Dish;

import java.util.List;

public interface IDishPersistencePort {
    void saveDish(Dish dish,Long idUser);
    void updateDish(Dish dish,Long idUser);
    void updateDishStatus(Dish dish,Long idUser);
    List<Dish> getDishes(int pageNumber, int pageSize, Long idRestaurant, Long idCategory);
}