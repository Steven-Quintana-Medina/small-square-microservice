package com.pragma.powerup.smallsquaremicroservice.domain.usercase;

import com.pragma.powerup.smallsquaremicroservice.domain.api.IDishServicePort;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Dish;
import com.pragma.powerup.smallsquaremicroservice.domain.spi.IDishPersistencePort;

import java.util.List;

import static com.pragma.powerup.smallsquaremicroservice.domain.services.RestaurantService.validRange;

public class DishUseCase implements IDishServicePort {
    private final IDishPersistencePort dishPersistencePort;

    public DishUseCase(IDishPersistencePort dishesPersistencePort) {
        this.dishPersistencePort = dishesPersistencePort;
    }

    @Override
    public void saveDish(Dish dish,Long idUser) {
        dishPersistencePort.saveDish(dish, idUser);
    }

    @Override
    public void updateDish(Dish dish, Long idUser) {
        dishPersistencePort.updateDish(dish,idUser);
    }

    @Override
    public void updateDishStatus(Dish dish, Long idUser) {
        dishPersistencePort.updateDishStatus(dish,idUser);
    }

    @Override
    public List<Dish> getDishes(int pageNumber, int pageSize, Long idRestaurant,Long idCategory) {
        validRange(pageNumber,pageSize);
        pageNumber-=1;
        return dishPersistencePort.getDishes(pageNumber,pageSize,idRestaurant,idCategory);
    }
}
