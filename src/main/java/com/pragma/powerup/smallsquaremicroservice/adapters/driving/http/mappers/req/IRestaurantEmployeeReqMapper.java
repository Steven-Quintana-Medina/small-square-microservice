package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.mappers.req;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.RestaurantEmployeeReqDto;
import com.pragma.powerup.smallsquaremicroservice.domain.model.RestaurantEmployee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRestaurantEmployeeReqMapper {
    @Mapping(target = "idRestaurant.id", source = "idRestaurant")
    RestaurantEmployee toRestaurantEmployee(RestaurantEmployeeReqDto restaurantEmployeeReqDto);
}
