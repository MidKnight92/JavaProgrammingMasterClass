package com.viveros.steph.controlflowchallenges;

public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-1234));
        numberToWords(1010);

//        numberToWords(10);
    }
    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        } else if (number == 0){
            System.out.println("Zero");
        } else {
            int counter = getDigitCount(number);
            int reversedNumber = reverse(number);

            while (counter > 0) {

                // Extract the last digit of the given number using the remainder operator
                int lastDigit = reversedNumber % 10;

                // move decimal place one to the left
                reversedNumber /= 10;

                // Convert the value of the digit found above
                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                counter--;
            }
        }
    }

    public static int reverse(int number){
        boolean isNegative = number < 0;
        String num = isNegative ? String.valueOf(Math.abs(number)) : String.valueOf(number);
        int length = num.length() - 1;
        StringBuilder sb = new StringBuilder();

        for (int i = length; i >= 0; i--) {
            sb.append(num.charAt(i));
        }

        return isNegative ? Integer.parseInt("-" + sb.toString()) : Integer.parseInt(sb.toString());
    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }
        String num = String.valueOf(number);
        return num.length();
    }
}
