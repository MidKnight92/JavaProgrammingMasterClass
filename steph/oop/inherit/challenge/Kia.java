package com.viveros.steph.oop.inherit.challenge;

public class Kia extends Car {
    private boolean autostart;
    private boolean pushToStart;
    public Kia(int gears, String manufactured){
        this(gears, manufactured, false, false);
    }

    public Kia(int gears, String manufactured, boolean autostart, boolean pushToStart){
        super(4,4, gears, 0, 2,manufactured ,"optima");
        this.autostart = autostart;
        this.pushToStart = pushToStart;
    }

    public void clickGearPedal(){
        super.changingGears();
    }
}
