package com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.mappers;

import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.entity.RestaurantEmployeeEntity;
import com.pragma.powerup.smallsquaremicroservice.domain.model.RestaurantEmployee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IRestaurantEmployeeEntityMapper {
    @Mapping(target = "idRestaurant.id",source = "idRestaurant.id")
    RestaurantEmployeeEntity toEntity(RestaurantEmployee restaurantEmployee);

    @Mapping(target = "idRestaurant.id",source = "idRestaurant.id")
    RestaurantEmployee toRestaurantEmployee(RestaurantEmployeeEntity restaurantEmployee);
}
