package com.viveros.steph.fundamentals;

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(6, 0));
        System.out.println(calcFeetAndInchesToCentimeters(7, 5));
        System.out.println(calcFeetAndInchesToCentimeters(-7, 5));
        System.out.println(calcFeetAndInchesToCentimeters(72));
        System.out.println(calcFeetAndInchesToCentimeters(32));

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        System.out.println("feet " + feet + " inches " + inches);
        if ( (feet < 0) || (inches > 12 || inches < 0) ){
            return -1;
        }
        return feet * 30.48 + inches * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if (inches < 0){
            return -1;
        }

        //  Divide inches by 12 to find feet as a decimial
        double feet = (int) inches / 12;

        int remainingInches = (int) feet % 12;

        // decimalFeet does not contain a decimal value ie inches = 0
       return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}
