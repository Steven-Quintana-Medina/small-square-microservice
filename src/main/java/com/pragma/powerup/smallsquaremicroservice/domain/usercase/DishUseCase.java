package com.pragma.powerup.smallsquaremicroservice.domain.usercase;

import com.pragma.powerup.smallsquaremicroservice.domain.api.IDishServicePort;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Dish;
import com.pragma.powerup.smallsquaremicroservice.domain.spi.IDishPersistencePort;

public class DishUseCase implements IDishServicePort {
    private IDishPersistencePort dishPersistencePort;

    public DishUseCase(IDishPersistencePort dishesPersistencePort) {
        this.dishPersistencePort = dishesPersistencePort;
    }

    @Override
    public void saveDish(Dish dish) {
        System.out.printf("xd");
        dishPersistencePort.saveDish(dish);
    }
}
