package com.viveros.steph.fundamentals;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(!true, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean needsToWakeUp = false;

        // Check hour of Day
        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }

        if (barking && (hourOfDay < 8 || hourOfDay > 22)){
            needsToWakeUp = true;
        }

        return needsToWakeUp;
    }
}
