package com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.adapter;

import com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.restclient.IMessageClient;
import com.pragma.powerup.smallsquaremicroservice.domain.datasource.IMessageClientPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MessageClientAdapter implements IMessageClientPort {
    private final IMessageClient messageClient;

    @Override
    public void sendPinSms(String sms) {
        messageClient.sendPinSMS(sms);
    }
}
