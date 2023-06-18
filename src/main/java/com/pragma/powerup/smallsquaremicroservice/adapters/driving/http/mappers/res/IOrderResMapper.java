package com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.mappers.res;

import com.pragma.powerup.smallsquaremicroservice.adapters.driving.http.dto.res.OrderResDto;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Order;
import com.pragma.powerup.smallsquaremicroservice.domain.model.OrderDish;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Restaurant;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IOrderResMapper {
    @IterableMapping(elementTargetType = OrderDish.class)
    List<OrderResDto> toOrderRes(List<Order> order);

    default Long map(Restaurant restaurant) {
        return restaurant.getId();
    }
}
