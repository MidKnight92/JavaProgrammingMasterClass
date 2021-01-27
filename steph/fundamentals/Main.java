package com.viveros.steph.fundamentals;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world");

        /*
               8 Primitives:
                    //byte
                    //short
                    //int
                    //long
                    //float
                    //double
                    //boolean
                    //char
         */

        int myNumber = ( 5 + 10 ) + ( 2 * 10 );

        int mySecondNumber = 12;
        int myThirdNumber = myNumber * 2;

        int sum = myNumber + mySecondNumber + myThirdNumber;
        System.out.println(sum);

        int myLastOne = 1000 - sum;
        System.out.println(myLastOne);

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        // what follows a literal string cast the previous int var into strings
        System.out.println("Integer mini value: " + myMinIntValue);
        System.out.println("Integer max value: " + myMaxIntValue);

        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println("Byte max: " + myMaxByte);
        System.out.println("Byte min: " + myMinByte);

        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;
        System.out.println("Short max: " + myMaxShort);
        System.out.println("Short min: " + myMinShort);

        long myLongValue = 100L;
        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println("Long max: " + myMaxLong);
        System.out.println("Long min: " + myMinLong);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByte / 2);
        System.out.println(myNewByteValue);

        short myNewShortValue = (short) (myMinShort / 2);
        System.out.println(myNewShortValue);

        byte byteChallenge = 10;
        short shortChallenge = 20;
        int intChallenge = 50;
        long longChallenge = 50_000L + (10L * (byteChallenge + shortChallenge + intChallenge));

        System.out.println(longChallenge);

        short shortTotal = (short) (1000 + 10 * (byteChallenge + shortChallenge + intChallenge + longChallenge));

        System.out.println(shortTotal);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float at min: " + myMinFloatValue);
        System.out.println("Float at max: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double at min: " + myMinDoubleValue);
        System.out.println("Double at max: " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
//        float myFloatValue =  5.23F;
//        double myDoubleValue = 5.34d;
        float myFloatValue =  5F / 3F;
        double myDoubleValue = 5.00 / 3.00; //recommended faster, math functions are written to return double

        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);
        System.out.println("MyFloatValue= " + myFloatValue);

//        Convert a given number of pounds to kilograms
        int lbs = 1;
        double kilogram = (double) lbs / 2.2046D;
        System.out.println("Converted: "+ kilogram);

        /*
                Chars
         */
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopyright = '\u00A9';
        System.out.println(myCopyright);

        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;

        boolean isCustomerOverTwentyOne = true;

        /*
                Strings
         */
        String myString = "This is a string literal";
        System.out.println("myString " + myString);
        myString = myString + "! Hell Yeah it is!";
        System.out.println(myString);
        myString = myString + " \u00A9 2020";
        System.out.println(myString);

        String numString = "250.33";
        numString = numString + "343.222";
        System.out.println(numString);

        String lastString = "10";
        int myInt = 34;
        lastString = lastString + myInt;

        System.out.println("LastString is equal to " + lastString); // even though myInt is an int it is being added to
        //string so it converts myInt to a string when appended to a string
        // this is the case for all types of numeric types

        /*
                    Operators
         */

        int result = 1 + 2; // 1 + 2 = 3 (two operators +, =) & (two operands 1,2)
        // operands is a term used to describe any object that is manipulated by an operator
        System.out.println("1 + 2" + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3-1 " + result);
        System.out.println("previousResult" + previousResult);
        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20/5 = 4
        System.out.println("20/5 = "+ result);

        result = result % 3;  // the remainder of (4 & 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; //1+1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2-1 = 1
        System.out.println("2-1 = " + result);

        // result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30;
        System.out.println("3 * 10 = " + result);

        // result = result /3;
        result /= 3; // 30/3 = 10;
        System.out.println("30/3 = " + result);

        // result = result -2
        result -= 2; // 10 -2 = 8
        System.out.println("10 -2 = " + result);

        /*
                Conditionals
         */

        boolean isAlien = false;

        if (!isAlien) {
            System.out.println("It is not an Alien!");
        }

        int topScore = 100;
        if (topScore >= 100){
            System.out.println("it's a 100 yo or IT'S BETTER");
        } else {
            System.out.println("100 yo");
        }
        int secondTopScore = 81;
        if ( (topScore > 90) || (secondTopScore <= 90) ){
            System.out.println("either or both of the conditions are true");
        }

        boolean isCar = false;
        if (isCar = true){ // this works because we are assigning isCar to a boolean and isCar is returning a boolean
            System.out.println("this is not suppose to happen");
        }

        // Correct
        if (isCar){ // this condition only runs when the condition is true which isCar is equal to true
            System.out.println("this is how you are suppose to write it");
        }

        /*
                ternary operator
         */

        boolean wasCar = isCar ? true : false; // three operands isCar, true false

        if (wasCar){
            System.out.println("wasCar is true");
        } else {
            System.out.println("wasCar is false");
        }
    }
}
