package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.mappers.req;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.DishReqDto;

import com.pragma.powerup.smallsquaremicroservice.domain.model.Dish;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IDishReqMapper {
    @Mapping(target = "idRestaurant.id",source = "idRestaurant")
    @Mapping(target = "idCategory.id",source = "idCategory")
    Dish toDish(DishReqDto dishReqDto);
}
