package com.pragma.powerup.smallsquaremicroservice.domain.service;

import com.pragma.powerup.smallsquaremicroservice.domain.exceptions.*;
import com.pragma.powerup.smallsquaremicroservice.domain.services.RestaurantService;

import org.junit.jupiter.api.Test;

import static com.pragma.powerup.smallsquaremicroservice.domain.utils.RestaurantModelValues.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;


public class RestaurantServiceTest {
    @Test
    public void testValidPhoneWithInvalidPhoneNumber() {
        for (String invalidPhoneNumber : INVALID_PHONE_NUMBERS) {
            assertThrows(InvalidPhoneException.class, () -> RestaurantService.ValidPHone(invalidPhoneNumber));
        }
    }

    @Test
    public void testValidNitWithInvalidNit() {
        for (String invalidNit : INVALID_NIT) {
            assertThrows(InvalidNitException.class, () -> RestaurantService.ValidNit(invalidNit));
        }
    }

    @Test
    public void testValidOwnerWithInvalidOwner() {
        assertThrows(InvalidUserException.class, ()->RestaurantService.ValidUser(INVALID_OWNER));
    }

    @Test
    public void testValidNameWithInvalidName() {
        assertThrows(InvalidNameException.class, ()->RestaurantService.ValidName(INVALID_NAME));
    }

    @Test
    public void testValidNameWithvalidName() {
        for (String validName : VALID_NAME) {
            assertDoesNotThrow(() -> RestaurantService.ValidName(validName));
        }
    }

    @Test
    public void testValidPageNumberAndPageSizeWithInvalidRange(){
        for (int invalidRange: INVALID_RANGE){
            assertThrows(InvalidRangeException.class,()->RestaurantService.validPageNumberAndPageSize(invalidRange,invalidRange));
        }
        assertThrows(InvalidRangeException.class,()->RestaurantService.validPageNumberAndPageSize(INVALID_RANGE[0], 5));

    }

    @Test
    public void testValidPageNumber(){
        for (int validRange: VALID_RANGE){
            assertDoesNotThrow(()->RestaurantService.validPageNumberAndPageSize(validRange,validRange));
        }

    }



}
