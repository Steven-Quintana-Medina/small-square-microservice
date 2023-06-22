package com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_pin")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderPinEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private OrderEntity idOrder;
    private String pin;
}
