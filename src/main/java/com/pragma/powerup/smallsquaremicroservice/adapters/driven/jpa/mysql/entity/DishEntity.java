package com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "dish")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DishEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @Column(updatable = false)
    private String name;

    private double price;

    private String description;

    @Column(updatable = false)
    private String urlImage;
    private boolean status = true;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_category", updatable = false)
    private CategoryEntity idCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Restaurant", updatable = false)
    private RestaurantEntity idRestaurant;
}
