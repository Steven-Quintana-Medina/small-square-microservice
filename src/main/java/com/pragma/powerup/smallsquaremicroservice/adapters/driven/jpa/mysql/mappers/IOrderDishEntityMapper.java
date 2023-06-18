package com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.mappers;

import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.entity.OrderDishEntity;
import com.pragma.powerup.smallsquaremicroservice.domain.model.OrderDish;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IOrderDishEntityMapper {
    @Mapping(target = "idOrder.id", source = "idOrder.id")
    @Mapping(target = "idDish.id", source = "idDish.id")
    List<OrderDishEntity> toEntity(List<OrderDish> orderDish);

    @Mapping(target = "idOrder.id", source = "idOrder.id")
    @Mapping(target = "idDish.id", source = "idDish.id")
    List<OrderDish> toModel(List<OrderDishEntity> orderDishEntity);
}
