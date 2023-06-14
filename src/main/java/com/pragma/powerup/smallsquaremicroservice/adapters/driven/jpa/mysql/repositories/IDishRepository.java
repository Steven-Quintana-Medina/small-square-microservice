package com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.repositories;

import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.entity.DishEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface IDishRepository extends JpaRepository<DishEntity,Long> {
    @Query("SELECT d FROM DishEntity d WHERE d.idRestaurant.id = :idRestaurant AND d.idCategory.id = :idCategory")
    Page<DishEntity> findByIdRestaurant( PageRequest pageable, @Param("idRestaurant") Long idRestaurant, @Param("idCategory") Long idCategory);
}
