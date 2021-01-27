package com.viveros.steph.controlflowchallenges;

public class PrintFactors {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
    public static void printFactors(int number){
        int iteration = 1;
        if (number < 1){
            System.out.println("Invalid Value");
        }

        while (iteration <= number){
            if ( number % iteration == 0){
                System.out.println(iteration);
            }
            iteration++;
        }

    }
}
