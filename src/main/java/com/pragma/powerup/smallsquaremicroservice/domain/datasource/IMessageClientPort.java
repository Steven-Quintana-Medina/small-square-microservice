package com.pragma.powerup.smallsquaremicroservice.domain.datasource;

public interface IMessageClientPort {
    void sendPinSms(String sms);

    void sendMessageDelivered();
}
