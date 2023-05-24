package com.pragma.powerup.smallsquaremicroservice.domain.api;

import com.pragma.powerup.smallsquaremicroservice.domain.model.Dish;

public interface IDishServicePort {
    void saveDish(Dish dish,Long idUser);
    void updateDish(Dish dish,Long idUser);
}