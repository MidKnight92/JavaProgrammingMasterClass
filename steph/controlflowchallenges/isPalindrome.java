package com.viveros.steph.controlflowchallenges;

//* Write method called isPalindrome with one int pararmeter called number
// the method needs to return a boolean
// it should return true if the number is a palindrome number otherwise it should return false
// */
public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }
    public static boolean isPalindrome(int number){
        int orginalNumber = number;
        int reversedNumber = 0;
        int count = 0;
        while (Math.abs(number) > 0){
            int lastDigit = number % 10;
            reversedNumber  *= 10;
            reversedNumber += lastDigit;
            number = (number - lastDigit) / 10;
            System.out.println("Iteration: " + count + " " +  reversedNumber);
            count++;
        }

        return reversedNumber == orginalNumber;
    }
}
