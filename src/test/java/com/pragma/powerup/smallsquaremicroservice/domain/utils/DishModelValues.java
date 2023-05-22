package com.pragma.powerup.smallsquaremicroservice.domain.utils;

import com.pragma.powerup.smallsquaremicroservice.domain.model.Category;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Dish;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Restaurant;

import static com.pragma.powerup.smallsquaremicroservice.domain.utils.RestaurantModelValues.INSTANCE_RESTAURANT;

public class DishModelValues {

    private static final Category category = new Category(2L,"bebidas","liquidos");
    public static final Dish INSTANCE_DISH = new Dish(
            "cd",
            100000.00,
            "Mote de queso",
            "https://youtu.be/m1a_GqJf02M",
            category,
            INSTANCE_RESTAURANT
    );
}