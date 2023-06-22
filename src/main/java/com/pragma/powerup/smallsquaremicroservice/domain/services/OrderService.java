package com.pragma.powerup.smallsquaremicroservice.domain.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pragma.powerup.smallsquaremicroservice.domain.enums.EnumStatusOrder;
import com.pragma.powerup.smallsquaremicroservice.domain.exceptions.OrderAlreadyNotifiedException;
import com.pragma.powerup.smallsquaremicroservice.domain.exceptions.OrderNotFoundException;
import com.pragma.powerup.smallsquaremicroservice.domain.model.MessageJson;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Order;

import java.util.Objects;

public class OrderService {

    public static void validOrderReady(Order order, Long id) {
        if (order == null) {
            throw new OrderNotFoundException(id);
        } else if (order.getStatus().equals(EnumStatusOrder.LISTO)) {
            throw new OrderAlreadyNotifiedException();
        }
    }

    public static String createJson(Order order, String phone, String pin) {
        MessageJson messageJson = new MessageJson(phone, order.getIdRestaurant().getPhone(), pin);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(messageJson);
        } catch (JsonProcessingException e) {
            System.err.println("Error al serializar el objeto JSON: " + e.getMessage());
            return null;
        }
    }

    public static void exists(String valid) {
        if (valid == null) {
            throw new NullPointerException();
        }
    }

    public static String codeSms(Order order, String phone) {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(order.getId());
        hash = 79 * hash + Objects.hashCode(order.getIdRestaurant().getPhone());
        hash = 79 * hash + Objects.hashCode(phone);
        return String.valueOf(Math.abs(hash));
    }
}
