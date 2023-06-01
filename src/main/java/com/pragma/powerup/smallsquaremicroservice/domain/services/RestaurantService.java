package com.pragma.powerup.smallsquaremicroservice.domain.services;

import com.pragma.powerup.smallsquaremicroservice.domain.exceptions.*;

import static com.pragma.powerup.smallsquaremicroservice.domain.utils.Constants.REGEX_NUM_VALUES;
import static com.pragma.powerup.smallsquaremicroservice.domain.utils.Constants.REGEX_VALID_PHONE;


public class RestaurantService {

    public static void validRange(int pageNumber, int pageSize){
        if(pageNumber<=0 || pageSize<=0){
            throw new InvalidRangeException();
        }
    }

    public static void ValidUser(boolean user){
        if(!user){
            throw new InvalidUserException();
        }
    }
    public static void ValidPHone(String phone) {
        if (!phone.matches(REGEX_VALID_PHONE)) {
            throw new InvalidPhoneException();
        }
    }

    public static void ValidNit(String nit) {
        if (!nit.matches(REGEX_NUM_VALUES)) {
            throw new InvalidNitException();
        }
    }

    public static void ValidName(String name) {
        if (name.matches(REGEX_NUM_VALUES)) {
            throw new InvalidNameException();
        }
    }
}
