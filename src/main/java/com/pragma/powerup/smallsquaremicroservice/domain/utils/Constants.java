package com.pragma.powerup.smallsquaremicroservice.domain.utils;

public class Constants {
    private Constants() {
        throw new IllegalStateException("Utility class");
    }

    //regex
    public static final String REGEX_NUM_VALUES = "^\\d+$";
    public static final String REGEX_VALID_PHONE = "^\\+\\d{12}$";

}
