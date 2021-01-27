package com.viveros.steph.controlflowchallenges;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HasSharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(55,15));
    }
    public static boolean hasSharedDigit(int number1, int number2){
        if ( ( number1 < 10 || number1 > 99 ) || ( number2 < 10 || number2 > 99 )){
            return false;
        }
        String number1String = Integer.toString(number1);
        String number2String = Integer.toString(number2);

        int[] numbers1Arr = new int[number1String.length()];
        int[] numbers2Arr = new int[number1String.length()];

        for (int i = 0; i < number1String.length(); i++){
            for (int j = 0; j < number2String.length(); j++){
                numbers1Arr[i] = Integer.parseInt(String.valueOf(number1String.charAt(i)));
                numbers2Arr[i] = Integer.parseInt(String.valueOf(number2String.charAt(i)));

                if (numbers1Arr[i] == numbers2Arr[j]){
                    return true;
                }

            }
        }
        return false;
    }
}
/*public class SharedDigit {

   public static boolean hasSharedDigit(int number1, int number2) {

        if (number1 > 10 && number2 > 10 && number1 <=99 && number2 <= 99) {
            return false;

        }

         String s1 = Integer.toString(number1);

         String s2 = Integer.toString(number2);

        if (s1.contains(Character.toString(s2.charAt(0))) || s1.contains(Character.toString(s2.charAt(1)))) {

            return true;

        }
        return false;
    }

}

*/

/*
    public static boolean hasSharedDigit(int x, int y) {

        if (x < 10 || x > 99 || y < 10 || y > 99) {

            return false;

        }

        if (x % 10 == y / 10 || x % 10 == y % 10 || x / 10 == y / 10) {

            return true;

        } else {

            return false;

        }

    }
}*/
