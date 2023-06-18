package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.res;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Getter
public class OrderResDto {
    private Long id;
    private Date date;
    private String status;
    private Long idClient;
    private Long idChef;
    private Long idRestaurant;
    private List<OrderDishResDto> orderDishes;
}
