package com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.repositories;

import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRestaurantRepository extends JpaRepository<RestaurantEntity,Long> {
    boolean existsByNit(String nit);

    boolean existsByPhone(String phone);
    Optional<RestaurantEntity> findByIdAndIdOwner(Long id, Long idOwner);
}
