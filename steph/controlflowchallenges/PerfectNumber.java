package com.viveros.steph.controlflowchallenges;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
    public static boolean isPerfectNumber(int number){
        int iteration = 1;
        int sum = 0;
        if (number < 1){
            return false;
        }

        while (iteration <= number){
            if ( (number % iteration == 0) && ( iteration != number) ){
                sum += iteration;
            }

            iteration++;
        }
        return sum == number;
    }
}
