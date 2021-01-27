package com.viveros.steph.oop.inherit.challenge;

public class Car extends Vehicle{
    private boolean steeringWheel;
    private int numberOfPedals;
    private String manufacturedYear;
    public Car(int wheels, int doors, int gears, int speed, int numberOfPedals, String manufacturedYear, String name){
        super(wheels,  doors, gears, speed, name );
        this.steeringWheel = true;
        this.numberOfPedals = numberOfPedals;
        this.manufacturedYear = manufacturedYear;
    }
    @Override
    public void steering(String direction){
        System.out.println("The car is steering to the " + direction + ".");
    }

    private boolean areHandsOnWheel(boolean isSteering){
        if (isSteering && hasSteeringWheel()){
            this.moving();
            super.steering("forward");
            return true;
        }
        return false;
    }

    @Override
    public void moving() {
        super.moving();
        System.out.println("This is a car");
    }

    public boolean hasSteeringWheel() {
        return steeringWheel;
    }

    public void HasSteeringWheel(boolean hasSteeringWheel) {
        this.steeringWheel = hasSteeringWheel;
    }

    public int getNumberOfPedals() {
        return numberOfPedals;
    }

    public void setNumberOfPedals(int numberOfPedals) {
        this.numberOfPedals = numberOfPedals;
    }

    public String getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(String manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }
}

