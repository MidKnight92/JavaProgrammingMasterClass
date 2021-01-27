package com.viveros.steph.controlflowchallenges;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));

    }
    /* Euclid Algorithm
    1. drop negative signs
    2. find the larger of the two numbers
    3. dividend = divisor * quotient + remanider
    4. Calculate the remainder, and substitute it into the appropriate place in the algo
    5. Write out the algo again, but this time use the old divisor as the new dividend and use the remainder as the new
    divisor
    6. Repeat until the remainder is 0
    7. The last divisor is the greatest common divisor

    Source:
    https://www.wikihow.com/Find-the-Greatest-Common-Divisor-of-Two-Integers
    * */
    public static int getGreatestCommonDivisor(int first, int second){
        final int MIN = 10;
        boolean flag = true;
        int gcd = 0;
        int dividend;
        int divisor;
        int remainder;

        if (first < MIN || second < MIN){
            return -1;
        }

        if (first > second){
            dividend = first;
            divisor = second;
        } else {
            dividend = second;
            divisor = first;
        }

        while (flag){

            remainder = dividend % divisor;

            if (remainder == 0){
                flag = false;
                gcd = divisor;
            }

            dividend = divisor;
            divisor = remainder;
        }
        return gcd;
    }
}
