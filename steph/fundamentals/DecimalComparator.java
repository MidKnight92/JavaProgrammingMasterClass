package com.viveros.steph.fundamentals;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    // compare values to third decimal place (thousands decimal place)
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int val1 = (int) (num1 *1000);
        int val2 = (int) (num2 *1000);
        System.out.println(val1);

        return val1 == val2;
    }
}
