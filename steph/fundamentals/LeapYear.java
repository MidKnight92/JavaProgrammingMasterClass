package com.viveros.steph.fundamentals;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }

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
}
