package org.example;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {
    private List<SmartDevice> devices;
    private static HomeStats stats = new HomeStats() ;
//Вложенный класс
    public static class HomeStats {
        private int totalDevicesOn;
        private int lightUsageCount;
        private double avgTermostatTemp;

        public void incrementLightUsage(){
            this.lightUsageCount++;
        }
    public void decrementLightUsage(){
        this.lightUsageCount--;
    }
        public void updateAvgUsage(double temp) {
            this.avgTermostatTemp = temp;
        }
    }

    public SmartHome() {
    this.devices = new ArrayList<>();
    }
    public void addDevice(SmartDevice device) {
        devices.add(device);
    }
    public void turnOnAll(){
        for(SmartDevice device: devices) {
            device.turnOn();
        }
    }
    public void turnOffAll() {
        for(SmartDevice device: devices){
            device.turnOff();
        }
    }


}
