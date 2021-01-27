package com.viveros.steph.controlflowchallenges;

public class sumFirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }
    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        if (number < 0){
            return -1;
        } else if (number == 0) {
            return sum;
        } else {
            String numAsString = Integer.toString(number);
            int numLength = numAsString.length();
            sum = Integer.parseInt(String.valueOf(numAsString.charAt(0))) + Integer.parseInt(String.valueOf(numAsString.charAt(numLength - 1)));
        }
        return sum;
    }
}
