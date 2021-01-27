package com.viveros.steph.oop.inherit;

public class Dog extends Animal{
    // instance fields (state) unique
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int
               teeth, String coat) {
        super(name, 1, size, weight, 1); // call the constructor from the superclass
        // allows us to iniialize base state of the animal in the constructor
        this.eyes = eyes;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }


    @Override
    public void eat(){
        System.out.println("woof chomp woof");
        System.out.println("calling super");
        super.eat(); // only execute the eat method in the super class
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(5); // using move without the super keyword tells java to look for a move in this class first
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(20); // same as above automatically runs line 41
    }
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
