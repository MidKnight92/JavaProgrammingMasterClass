package com.viveros.steph.oop.inherit;

public class Fish extends  Animal{
    private  int gills;
    private int eyes;
    private int fins;
    public Fish(String name, int size, int weight, int eyes, int fins, int gills) {
        super(name, 1, size, weight, 1);
        this.eyes = eyes;
        this.fins = fins;
        this.gills = gills;
    }
    public void rest(){

    }

    public void swim(int speed){
        System.out.println("Swimming");
        moveMuscles();
        moveBackFins();
        super.move(speed);
    }
    private void moveMuscles(){
        System.out.println("Move those muscles");
    }
    private void moveBackFins(){
        System.out.println("Fins moving");
    }
}
