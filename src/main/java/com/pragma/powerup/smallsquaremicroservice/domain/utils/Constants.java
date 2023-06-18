package com.pragma.powerup.smallsquaremicroservice.domain.utils;

import java.util.Date;

public class Constants {
    //regex
    public static final String REGEX_NUM_VALUES = "^\\d+$";
    public static final String REGEX_VALID_PHONE = "^\\+\\d{12}$";
    //variables
    public static final Date CURRENT_DATE = new Date();

    private Constants() {
        throw new IllegalStateException("Utility class");
    }

}
