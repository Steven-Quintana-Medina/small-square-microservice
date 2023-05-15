package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.mappers.req;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.RestaurantReqDto;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRestaurantReqMapper {
    Restaurant toRestaurant(RestaurantReqDto restaurantReqDto);
}
