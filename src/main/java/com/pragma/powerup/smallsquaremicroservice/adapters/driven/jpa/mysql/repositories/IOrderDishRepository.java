package com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.repositories;

import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.entity.OrderDishEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IOrderDishRepository extends JpaRepository<OrderDishEntity, Long> {
    @Query("SELECT od FROM OrderDishEntity od WHERE od.idOrder.status = :statusOrder AND od.idOrder.idRestaurant.id = :idRestaurant")
    List<OrderDishEntity> findByIdRestaurant(@Param("statusOrder") String statusOrder, @Param("idRestaurant") Long idRestaurant);
}
