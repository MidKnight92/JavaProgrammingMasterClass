package com.viveros.steph.oop.inherit.challenge;

public class Vehicle {
    // Instance variables
    private int wheels;
    private int doors;
    private int gears;
    private int speed;
    private String name;

    public Vehicle(){
        this(2, 2, 4, 0, "default");
    }

    public Vehicle(int wheels, int doors, int gears, int speed, String name){
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.speed = speed;
        this.name = name;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public int getSpeed() {
        return speed;
    }

    public void steering(String direction){
        System.out.println("Vehicle is steering to the " + direction + ".");
    }

    public void moving(){
        if (getSpeed() > 0 ){
            System.out.println("The vehicle is moving at " + getSpeed() + "mph.");
        }
    }

    public void changingGears(){
        if(getGears() < 4){
            int currentGear = getGears();
            int increaseGear = currentGear + 1;
            setGears(increaseGear);
            System.out.println("The previous gear was in " + currentGear + "it is now in" + increaseGear);
        }
    }

}
