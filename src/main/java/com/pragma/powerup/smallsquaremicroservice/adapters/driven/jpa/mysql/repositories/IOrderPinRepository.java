package com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.repositories;

import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.entity.OrderPinEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IOrderPinRepository extends JpaRepository<OrderPinEntity, Long> {
    Optional<OrderPinEntity> findByPin(String id);
}
