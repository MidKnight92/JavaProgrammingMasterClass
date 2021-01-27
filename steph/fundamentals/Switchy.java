package com.viveros.steph.fundamentals;

public class Switchy {
    private static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void main(String[] args) {
        /*
                    Example
        Switch can be used with byte short long and int

        int switchValue = 1;
        switch (switchValue){
            case 1:
                System.out.println("The value is one");
                break;
            case 2:
                System.out.println("The Value is two");
                break;
            case 3: case 4: case 5:
                System.out.println("the value was either a three, four, or 5");
                System.out.println("the value was " + switchValue);
                break;
            default:
                System.out.println("The value was neither 1 nor 2");
                break;
         */
        char charVal = 'G';
        charVal = 'A';
        switch (charVal){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Found Value: " + charVal);
                break;
            default:
                System.out.println("Value was not found");
                break;

        }

        String month = "January";

        switch ( month.toLowerCase() ){
            case "january":
                System.out.println("it's january");
                break;
            case "june":
                System.out.println("it's june");
                break;
            default:
                System.out.println("not found");
                break;
        }

        printDayOfTheWeek(3);
        printDayOfTheWeek(-3);

    }
}
