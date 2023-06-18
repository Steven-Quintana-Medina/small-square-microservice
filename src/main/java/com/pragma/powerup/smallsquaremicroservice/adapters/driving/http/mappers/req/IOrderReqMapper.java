package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.mappers.req;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.req.OrderReqDto;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Dish;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Order;
import com.pragma.powerup.smallsquaremicroservice.domain.model.OrderDish;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IOrderReqMapper {
    @Mapping(target = "idRestaurant.id", source = "idRestaurant")
    @IterableMapping(elementTargetType = OrderDish.class)
    Order toOrder(OrderReqDto orderReqDto);

    default Dish map(Long value) {
        Dish dish = new Dish();
        dish.setId(value);
        return dish;
    }

}
