package com.viveros.steph.controlflowchallenges;

public class GetEvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number){
        int sumOfEvens = 0;
        if ( number < 0 ){
            return -1;
        }

        while (number > 0){
            int digit = number % 10;
            sumOfEvens = ( digit % 2 == 0 ) ? sumOfEvens += digit : sumOfEvens;
            number /= 10;
        }
        return sumOfEvens;
    }
}
