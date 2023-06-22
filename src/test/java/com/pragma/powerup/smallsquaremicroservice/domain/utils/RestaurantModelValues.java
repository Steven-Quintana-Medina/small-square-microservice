package com.pragma.powerup.smallsquaremicroservice.domain.utils;

import com.pragma.powerup.smallsquaremicroservice.domain.model.Restaurant;

public class RestaurantModelValues {
    public static final Restaurant INSTANCE_RESTAURANT = new Restaurant(
            7L,
            "100000",
            "Mote de queso",
            "Los alpes MZ Z L 8",
            "+573004709632",
            "https://www.uhdpaper.com/2023/04/night-sky-clouds-sunset-scenery-4k-7700i.html",
            3L
    );
    public static final String[] INVALID_NIT = {"DDA5454", "DDDDDDD"};
    public static final String[] INVALID_PHONE_NUMBERS = {"1234567", "+57300A014079", "+57300401407", "573004014079"};
    public static final boolean INVALID_OWNER = false;
    public static final String INVALID_NAME = "0000031";
    public static final String[] VALID_NAME = {"CODIGO_", "PUERTO 003"};

    public static final int[] INVALID_RANGE = {-157, 0, -50};
    public static final int[] VALID_RANGE = {156, 2, 508};
}