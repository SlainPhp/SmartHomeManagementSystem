package org.example;

public class SmartTV extends SmartDevice implements Controllable{
    private int volume;
    public SmartTV(String name, RoomType room) {
        super(name, room);
        this.volume = 20;
    }

    @Override
    public void increaseValue() {
        if(volume < 100) {
            volume++;
            System.out.println("Громкость на телевизоре в " + room.name() + " " + volume);
        }else{
            System.out.println("Достигнута максимальная громкость");
        }
    }

    @Override
    public void decreaseValue() {
    if(volume > 0) {
        volume--;
        System.out.println("Громкость на телевизоре в "+ room.name() + " " + volume);
    }else {
        System.out.println("Достигнута минимальная громкость");
        }
    }
}
