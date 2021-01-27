package com.viveros.steph.digitsumchallenge;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(55));
    }

    public static int sumDigits(int number){
        int sum = 0;

        if (number < 10){
            return -1;
        } else {

            // Convert int to String
            String digits = Integer.toString(number);

            // loop thru length of string
            for (int i = 0; i < digits.length(); i++) {

                // add the parsed value of each char
                sum += Integer.parseInt(String.valueOf(digits.charAt(i)));
            }

        }

        return sum;
    }

    /*public static int sumDigits(int number){
    *   if (number < 10){
    *       return -1;
    * }
    * int sum = 0;
    * // 125 --> 125/ 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
    * while ( number > 0){
    *   // extract the least-significant digit
    *   int digit = number % 10;
    *   sum += digit;
    *
    *   // drop the least-significant digit
    *   number /= 10;
    * }
    * return sum
    * */
}
