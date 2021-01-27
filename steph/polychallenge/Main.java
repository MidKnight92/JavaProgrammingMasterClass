package com.viveros.steph.polychallenge;

import com.viveros.steph.encapChallenge.Printer;

//Base Class
class Car {

    // instance Fields
    String name;
    int year;
    int wheels;
    int doors;
    int cylinders;
    String driveType;
    boolean engine;

    public Car(String name, int year, int doors, int cylinders, String driveType) {
        this.year = year;
        this.name = name;
        this.doors = doors;
        this.cylinders = cylinders;
        this.driveType = driveType;

        // Auto field
        this.engine = true;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("Starting Engine vroom vroom");
    }

    public void accelerate() {
        System.out.println("Moving! get out the way! vrooooooom");
    }

    public void stop() {
        System.out.println("Stop!");
    }

    public void getStats() {
        System.out.println(name + " made in " + year + " has " + driveType + " and " + cylinders + " number of cylinder");
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getDoors() {
        return doors;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getDriveType() {
        return driveType;
    }

}

class Lambo extends Car{
    public Lambo(){
        super("Lamborgini Aventador", 2021, 2, 12, "All Wheel Drive");
    }
    @Override
    public void startEngine(){
        System.out.println("VROOOM VROOM VROOM LAMBO");
    }
    @Override
    public void accelerate(){
        System.out.println("VROOOOOOOOOOOOOOOOOOOOOMMMMMMMMMMMMMMMMMMMMM");
    }
}

class Prius extends Car{
    public Prius(){
        super("Toyota Prius", 2021, 4, 4, "AWD-e");
    }
    @Override
    public void startEngine() {
        System.out.println("Starting Engine   * silence *  ");
    }
    @Override
    public void accelerate(){
        System.out.println("    * silence *   ");
    }

}

    class Optima extends Car{

    public Optima(){
        super("Kia Optima", 2014, 4,4,"FWD" );
    }

    @Override
    public void startEngine(){
        System.out.println(getName() + " push to start vroom");
    }

}




public class Main {
    public static void main(String[] args) {
        Optima optima = new Optima();
        optima.getStats();
        optima.startEngine();
        Lambo lambo = new Lambo();
        lambo.startEngine();
        lambo.accelerate();
        Prius prius = new Prius();
        prius.startEngine();
        prius.accelerate();
    }
}
