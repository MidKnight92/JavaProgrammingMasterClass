package com.viveros.steph.oopchallenge;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("White", "Red", 3.00);
        hamburger.addAddition("lettuce");
        hamburger.addAddition("tomatoes");
        hamburger.addAddition("carrots");
        hamburger.addAddition("jalepenos");
        hamburger.addAddition("banana peppers");
        System.out.println(hamburger.getPrice());
        hamburger.getBurgerDetails();
        hamburger.printItemizedReciept();
        HealthyBurger healthyBurger = new HealthyBurger();
        System.out.println("Printing Healthy Burger Stuff below");
        System.out.println(healthyBurger.getPrice());
        healthyBurger.addAddition("lettuce");
        healthyBurger.addAddition("tomatoes");
        healthyBurger.addAddition("carrots");
        healthyBurger.addAddition("jalepenos");
        healthyBurger.addAddition("banana peppers");
        healthyBurger.addAddition("onion");
        healthyBurger.addAddition("hot sauce");
        healthyBurger.getBurgerDetails();
        healthyBurger.printItemizedReciept();
        System.out.println("Printing Deluxe Burger stuff");
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println(deluxeBurger.getAddition3());
        deluxeBurger.printItemizedReciept();

    }
}
