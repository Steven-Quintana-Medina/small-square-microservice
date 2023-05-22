package com.pragma.powerup.smallsquaremicroservice.domain.api;

import com.pragma.powerup.smallsquaremicroservice.domain.model.Dish;

public interface IDishServicePort {
    void saveDish(Dish dishe);
}