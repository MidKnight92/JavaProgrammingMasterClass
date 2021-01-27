package com.viveros.steph.encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Steph", "lightsaber", 120);
        System.out.println(player.getName() + " has a " +  player.getWeapon() + " and an inital health of "  + player.getHealth());

    }
}
