package com.viveros.steph.refvsvalue;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        reverse(arr);
    }
    // goal {1,2,3,4,5} to {5,4,3,2,1}
    private static void reverse(int[] array){
        System.out.println("Before reverse: " + Arrays.toString(array));
        int temp;
        for (int i = 0; i < array.length/2 ; i++) {
            temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }
        System.out.println("After reverse: " + Arrays.toString(array));
    }

}
