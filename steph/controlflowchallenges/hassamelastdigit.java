package com.viveros.steph.controlflowchallenges;

public class hassamelastdigit {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }
    
    public static boolean hasSameLastDigit(int number1, int number2, int number3){

        if ( !isValid(number1)  ||  !isValid(number2) || !isValid(number3) )
        {
            return false;
        }

        int num1LastDigit = number1 % 10;
        int num2LastDigit = number2 % 10;
        int num3LastDigit = number3 % 10;

        return (num1LastDigit == num2LastDigit) || (num1LastDigit == num3LastDigit) || (num2LastDigit == num3LastDigit);
    }

    public static boolean isValid(int number){
        final int MIN = 10;
        final int MAX = 1000;

        // check the number is in range of the min or max values
        return ( number >= MIN && number <= MAX ) ;
    }
}
