package org.example;

public class SmartLight extends SmartDevice implements Controllable{
    private int brightness;

    public SmartLight(String name, RoomType room) {
        super(name, room);
        this.brightness = 50;
    }
    @Override
    public void increaseValue() {
    if(brightness<100) {
        brightness++;
        System.out.println("Яркость света в "+ room.name() + "увеличина до " + brightness );
    }else{
        System.out.println("Достигнута максимальная яркость");
    }
    }

    @Override
    public void decreaseValue() {
        if(brightness> 0) {
            brightness--;
            System.out.println("Яркость света в " + room.name() + "уменьшена до " + brightness);
        }else {
            System.out.println("Достигнута минимальная яркость");
        }

    }
}
