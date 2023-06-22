package com.pragma.powerup.smallsquaremicroservice.domain.model;

public class MessageJson {

    private String phoneClient;
    private String phoneSender;
    private String pin;

    public MessageJson(String phoneClient, String phoneSender, String pin) {
        this.phoneClient = phoneClient;
        this.phoneSender = phoneSender;
        this.pin = pin;
    }

    public String getPhoneClient() {
        return phoneClient;
    }

    public void setPhoneClient(String phoneClient) {
        this.phoneClient = phoneClient;
    }

    public String getPhoneSender() {
        return phoneSender;
    }

    public void setPhoneSender(String phoneSender) {
        this.phoneSender = phoneSender;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
