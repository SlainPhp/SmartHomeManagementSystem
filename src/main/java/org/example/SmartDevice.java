package org.example;

public abstract class SmartDevice {
    private String name;
    private boolean isOn;
    RoomType room;

    public SmartDevice(String name, RoomType room) {
        this.name = name;
        this.room = room;
        this.isOn = false;
    }

    public final void turnOn() {
        System.out.println(name +" в комнате " + room.name() + " включен");
        isOn = true;
    }
    public final void turnOff() {
        System.out.println(name + " в комнате " + room.name() +  " выключен");
        isOn = false;
    }
}




