package com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.mappers;

import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.entity.OrderEntity;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IOrderEntityMapper {
    @Mapping(target = "status", source = "status")
    @Mapping(target = "idRestaurant.id", source = "idRestaurant.id")
    OrderEntity toEntity(Order order);

    @Mapping(target = "status", source = "status")
    @Mapping(target = "idRestaurant.id", source = "idRestaurant.id")
    List<OrderEntity> toEntity(List<Order> order);

    @Mapping(target = "status", source = "status")
    @Mapping(target = "idRestaurant.id", source = "idRestaurant.id")
    Order toOrder(OrderEntity order);

    @Mapping(target = "status", source = "status")
    @Mapping(target = "idRestaurant.id", source = "idRestaurant.id")
    List<Order> toOrder(Page<OrderEntity> order);
}
