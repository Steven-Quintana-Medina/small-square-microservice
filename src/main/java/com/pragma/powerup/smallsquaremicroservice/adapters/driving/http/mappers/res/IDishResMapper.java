package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.mappers.res;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.res.DishResDto;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Dish;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IDishResMapper {
    List<DishResDto> toDishList(List<Dish> dish);
}
