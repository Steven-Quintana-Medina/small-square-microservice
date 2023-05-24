package com.pragma.powerup.smallsquaremicroservice.domain.spi;


import com.pragma.powerup.smallsquaremicroservice.domain.model.Dish;

public interface IDishPersistencePort {
    void saveDish(Dish dish,Long idUser);
    void updateDish(Dish dish,Long idUser);
}