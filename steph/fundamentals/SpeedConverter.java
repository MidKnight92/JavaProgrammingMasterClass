package com.viveros.steph.fundamentals;

public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(2.00);
    }


    public static long toMilesPerHour(double kilometersPerHour){

        long mph = -1;

        if (kilometersPerHour >= 0 ){
            mph = Math.round(kilometersPerHour / 1.609);
        }

        return mph;
    }

    public static void printConversion(double kilometersPerHour){

        if (kilometersPerHour < 0 ){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");

        }
    }
}
