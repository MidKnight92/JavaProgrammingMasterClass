package com.viveros.steph.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//
//        int[] myIntArray = new int[]{1,2,3};
//
//        int[] myIntArray1 = new int[3];
//        myIntArray1[0] = 1;
//        myIntArray1[1] = 2;
//        myIntArray1[2] = 3;
//
//        printArray(myIntArray);
//    }
//
//    public static void printArray(int[] array){
//        for (int i = 0; i <array.length ; i++) {
//            System.out.println(array[i] * 3);
//        }
//    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       getIntergers(5);
    }

    public static void getIntergers(int length){
        int[] userVals = new int[length];

        System.out.println("Input 5 arbitrary numbers:");
        for (int i = 0; i < length; i++){
            userVals[i] = scanner.nextInt();
        }
        calculateAvg(userVals);
    }

    public static double calculateAvg(int[] nums){
        int sum = 0;
        double result = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        result = (double) sum/nums.length;

        System.out.println(Arrays.toString(nums));
        System.out.println("result: " + sum + "/" + nums.length + " = " + result);
        return result;
    }

}
