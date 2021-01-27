package com.viveros.steph.oop.inherit;

// base class
public class Animal {
    // State
    private String name;
    private int brain;
    private int size;
    private int weight;
    private int body;

    public Animal(String name, int brain, int size, int weight, int body) {

        this.name = name;
        this.brain = brain;
        this.size = size;
        this.weight = weight;
        this.body = body;
    }


    public void eat(){
        System.out.println("chomp chomp");
    }

    public void move(int speed){
        System.out.println("move " + speed);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public int getBody() {
        return body;
    }

}
