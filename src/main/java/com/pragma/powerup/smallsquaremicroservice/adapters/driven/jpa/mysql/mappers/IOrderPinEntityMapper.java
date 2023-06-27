package com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.mappers;

import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.entity.OrderPinEntity;
import com.pragma.powerup.smallsquaremicroservice.domain.model.OrderPin;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IOrderPinEntityMapper {
    @Mapping(target = "idOrder.id", source = "idOrder.id")
    OrderPinEntity toEntity(OrderPin orderPin);

    @Mapping(target = "idOrder.id", source = "idOrder.id")
    OrderPin toModel(OrderPinEntity orderPinEntity);
}
