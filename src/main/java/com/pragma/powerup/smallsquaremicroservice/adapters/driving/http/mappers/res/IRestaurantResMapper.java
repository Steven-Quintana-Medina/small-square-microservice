package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.mappers.res;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.res.RestaurantResDto;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRestaurantResMapper {
    List<RestaurantResDto> toRestaurantList(List<Restaurant> restaurantList);
}
