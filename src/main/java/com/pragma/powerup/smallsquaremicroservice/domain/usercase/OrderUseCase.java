package com.pragma.powerup.smallsquaremicroservice.domain.usercase;

import com.pragma.powerup.smallsquaremicroservice.domain.api.IOrderServicePort;
import com.pragma.powerup.smallsquaremicroservice.domain.enums.EnumStatusOrder;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Order;
import com.pragma.powerup.smallsquaremicroservice.domain.spi.IOrderDishPersistencePort;
import com.pragma.powerup.smallsquaremicroservice.domain.spi.IOrderPersistencePort;

import static com.pragma.powerup.smallsquaremicroservice.domain.utils.Constants.CURRENT_DATE;

public class OrderUseCase implements IOrderServicePort {
    private final IOrderPersistencePort orderPersistencePort;
    private final IOrderDishPersistencePort orderDishPersistencePort;

    public OrderUseCase(IOrderPersistencePort orderPersistencePort, IOrderDishPersistencePort orderDishPersistencePort) {
        this.orderPersistencePort = orderPersistencePort;
        this.orderDishPersistencePort = orderDishPersistencePort;
    }

    @Override
    public void saveOrder(Order order, Long idClient) {
        order.setIdClient(idClient);
        order.setDate(CURRENT_DATE);
        order.setStatus(EnumStatusOrder.PENDIENTE);
        Order orderEntity = orderPersistencePort.saveOrder(order);

        order.getOrderDishes().forEach(orderDish -> {
            orderDish.setIdOrder(orderEntity);
    });
        orderDishPersistencePort.saveOrderDish(order.getOrderDishes());
}
}
