package com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.repositories;

import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.entity.OrderEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

public interface IOrderRepository extends JpaRepository<OrderEntity, Long> {
    @Query("SELECT o FROM OrderEntity o WHERE o.status = :statusOrder AND o.idRestaurant.id = :idRestaurant")
    Page<OrderEntity> findByIdRestaurant(PageRequest pageable, @PathVariable("statusOrder") String statusOrder, @PathVariable("idRestaurant") Long idRestaurant);
}
