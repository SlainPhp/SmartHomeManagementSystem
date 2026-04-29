package org.example;

public class SmartThermostat extends SmartDevice implements Controllable{
    private double temperature;
    public SmartThermostat(String name, RoomType room) {
        super(name, room);
        this.temperature = 15.0;
    }

    @Override
    public void increaseValue() {
        temperature+=0.5;
        System.out.println("Температура термостата " + room.name() + " "+ temperature);
    }

    @Override
    public void decreaseValue() {
    temperature-=0.5;
        System.out.println("Температура термостата " + room.name() + " " + temperature);
    }
}
