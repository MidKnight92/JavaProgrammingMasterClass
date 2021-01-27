package com.viveros.steph.refvsvalue;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.print("Enter a number for the total amount of values to be added: ");
        int userInput = scanner.nextInt();

        readIntegers(userInput);

    }

    /*readIntegers takes a single parameter count that represents how many integers
    * the user needs to enter
    *
    * @parameter count int precondition >= 0 */
    public static void readIntegers(int count){
        int[] usersNumbers = new int[count];
        int userInput;
        int currentIteration = 0;

        while (currentIteration < count){
            System.out.print("Enter the number (" + (currentIteration + 1) + " of " + count + "): " );
            userInput = scanner.nextInt();
            usersNumbers[currentIteration] = userInput;
            currentIteration++;
        }
        findMin(usersNumbers);
    }

    /*findMIn method finds the smallest number in the array and returns the value
    * @param flag = true
    * @param min = to the first value in the array
    *
    * when current array element is less the min value assign the current array elements value to the min variable
    * */
    public static int findMin(int[] arr){
        boolean flag = true;
        int min = arr[0];

        // run while true
        while (flag){
            // reassign to false this will avoid potential infinite loop and stop the loop from executing once min value has been found
            flag = false;
            
            for (int value : arr) {
                if (value < min) {
                    min = value;
                    flag = true;
                }
            }
        }
        return min;
    }
}
