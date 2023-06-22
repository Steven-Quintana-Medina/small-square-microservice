package com.pragma.powerup.smallsquaremicroservice.domain.utils;

import com.pragma.powerup.smallsquaremicroservice.domain.model.Category;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Dish;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Restaurant;


public class DishModelValues {

    public static final Restaurant INSTANCE_RESTAURANT = new Restaurant(
            7L,
            "100000",
            "Mote de queso",
            "Los alpes MZ Z L 8",
            "+573004709632",
            "https://www.uhdpaper.com/2023/04/night-sky-clouds-sunset-scenery-4k-7700i.html",
            3L
    );
    private static final Category category = new Category(2L, "bebidas", "liquidos");
    public static final Dish INSTANCE_DISH = new Dish(
            "cd",
            100000.00,
            "Mote de queso",
            "https://youtu.be/m1a_GqJf02M",
            category,
            INSTANCE_RESTAURANT,
            true
    );
}