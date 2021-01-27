package com.viveros.steph.refvsvalue;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = 10;

        System.out.println("myIntValue" + myIntValue);
        System.out.println("anotherIntValue" + anotherIntValue);

        /* Value types
        * when we created an int variable these values above a single space in memory
        * is allocated to store the variable directly holds a value (i.e., myIntValue & anotherIntValue holds the value of 10
        * repectively and then anotherIntValue holds the value of 11 once incremented by 1 but myIntValue holds its original value */
        anotherIntValue++;

        System.out.println("myIntValue" + myIntValue);
        System.out.println("anotherIntValue" + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray" + Arrays.toString(myIntArray));
        System.out.println("anotherArray" + Arrays.toString(anotherArray));

        anotherArray[3] = 43;

        System.out.println("after change myIntArray" + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray" + Arrays.toString(anotherArray));

        anotherArray = new int[]{13,45,2,6};
        modifyArray(myIntArray);

        System.out.println("after change myIntArray" + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray" + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[]{1,2,3,4,5};
    }
}
