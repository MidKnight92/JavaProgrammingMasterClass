package com.viveros.steph.fundamentals;

import javax.crypto.spec.PSource;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        boolean isLeapYr = false;

        // Check if year is out of range
        if ( ( year < 1 ) || ( year > 9999 ) ){
            return false;
        }

        if ( ( year % 4 == 0 ) && (year % 100 == 0 ) && ( year % 400 == 0) || (year % 4 == 0 ) && ( year % 100 != 0 ) ){
            isLeapYr = true;
        }

        return isLeapYr;
    }

    public static int getDaysInMonth(int month, int year){
        int daysInMonth = 0;

        // Check if year is out of range
        if ( ( year < 1 ) || ( year > 9999 ) ){
            return -1;
        }

        // Case numbers represent the month in the year
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 2:
                daysInMonth =  isLeapYear(year) ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth =  30;
                break;
            default:
                return -1;
        }
            return daysInMonth;
    }

    public static void main(String[] args) {
//        for (int i = 2; i < 9; i++){
//            System.out.println(String.format("%.2f", calculateInterest(10_000, i)));
//        }

//        for (int i = 8; i >= 2; i--){
//            System.out.println(i);
//            System.out.println(String.format("%.2f", calculateInterest(10_000, i)));
//        }

//        int count = 0;
//        for (int i = 10; i < 50; i++){
//            if (isPrime(i)){
//                System.out.println("num is prime " + i);
//                System.out.println(isPrime(i));
//                count++;
//
//                if (count == 3){
//                    break;
//                }
//
//            }
//        }

        int count = 0;
        int total = 0;

        for (int i = 1; i < 1_000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                total += i;
                count++;

                if (count == 5){
                    System.out.println("The total of the above numbers = " + total);
                    break;
                }
            }
        }



    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n){
        // prime number has to be greater than 1
        if (n == 1){
            return false;
        }

        // sqrt for n is to save time for computer
        for (int i = 2; i < (long) Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
}

/*
* public static boolean isLeapYear(int year){
        boolean isLeapYr = false;

        // Check if year is out of range
        if ( ( year < 1 ) || ( year > 9999 ) ){
            return false;
        }

        if ( ( year % 4 == 0 ) && (year % 100 == 0 ) && ( year % 400 == 0) || (year % 4 == 0 ) && ( year % 100 != 0 ) ){
            isLeapYr = true;
        }


        return isLeapYr;
    }
    * */