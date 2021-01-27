package com.viveros.steph.oop.inherit;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,2,4,1);
        Dog dog = new Dog("boston", 8, 22, 2, 4, 1,20, "short");
        animal.eat();
        animal.move(323);
        dog.eat();
        dog.move(34);
    }
}
