package com.viveros.steph.encapsulation;

public class Player {
    private String name;
    private String weapon;
    private int hitPoints = 100;

    public Player(String name, String weapon, int health){
        this.name = name;
        this.weapon = weapon;
        if (health > 0 && health <= 100){
            this.hitPoints = health;
        }
    }

    public void decreaseHealth(int damage){
        int newHealthResult = getHealth() - damage;
        if ( newHealthResult > 0){
            this.hitPoints = newHealthResult;
        } else {
            System.out.println("Player " + name + " is k.o.");
        }
    }

    public int getHealth() {
        return hitPoints;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }
}
