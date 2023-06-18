package com.pragma.powerup.smallsquaremicroservice.domain.usercase;

import com.pragma.powerup.smallsquaremicroservice.domain.api.IOrderServicePort;
import com.pragma.powerup.smallsquaremicroservice.domain.enums.EnumStatusOrder;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Order;
import com.pragma.powerup.smallsquaremicroservice.domain.model.OrderDish;
import com.pragma.powerup.smallsquaremicroservice.domain.spi.IOrderDishPersistencePort;
import com.pragma.powerup.smallsquaremicroservice.domain.spi.IOrderPersistencePort;
import com.pragma.powerup.smallsquaremicroservice.domain.spi.IRestaurantEmployeePersistencePort;

import java.util.List;
import java.util.Objects;

import static com.pragma.powerup.smallsquaremicroservice.domain.services.RestaurantService.validRange;
import static com.pragma.powerup.smallsquaremicroservice.domain.utils.Constants.CURRENT_DATE;

public class OrderUseCase implements IOrderServicePort {
    private final IOrderPersistencePort orderPersistencePort;
    private final IOrderDishPersistencePort orderDishPersistencePort;
    private final IRestaurantEmployeePersistencePort restaurantEmployeePersistencePort;

    public OrderUseCase(IOrderPersistencePort orderPersistencePort, IOrderDishPersistencePort orderDishPersistencePort, IRestaurantEmployeePersistencePort restaurantEmployeePersistencePort) {
        this.orderPersistencePort = orderPersistencePort;
        this.orderDishPersistencePort = orderDishPersistencePort;
        this.restaurantEmployeePersistencePort = restaurantEmployeePersistencePort;
    }

    @Override
    public void saveOrder(Order order, Long idClient) {
        order.setIdClient(idClient);
        order.setDate(CURRENT_DATE);
        order.setStatus(EnumStatusOrder.PENDIENTE);
        Order orderEntity = orderPersistencePort.saveOrder(order);

        order.getOrderDishes().forEach(orderDish -> orderDish.setIdOrder(orderEntity));
        orderDishPersistencePort.saveOrderDish(order.getOrderDishes());
    }

    @Override
    public List<Order> getRestaurantOrder(int pageNumber, int pageSize, String statusOrder, Long idEmployee) {
        validRange(pageNumber, pageSize);
        pageNumber -= 1;
        Long idRestaurant = restaurantEmployeePersistencePort.getRestaurantEmployee(idEmployee).getIdRestaurant().getId();
        List<OrderDish> orderDishes = orderDishPersistencePort.getRestaurantOrderDish(statusOrder, idRestaurant);
        List<Order> orders = orderPersistencePort.getRestaurantOrder(pageNumber, pageSize, statusOrder, idRestaurant);

        for (Order order : orders) {
            for (OrderDish orderDish : orderDishes) {
                if (Objects.equals(order.getId(), orderDish.getIdOrder().getId())) {
                    order.getOrderDishes().add(orderDish);
                }
            }
        }
        return orders;
    }
}

