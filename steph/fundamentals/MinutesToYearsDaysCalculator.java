package com.viveros.steph.fundamentals;

public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(-525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
            return;
        }
        long years = minutes / 525600;
        long remainingMinutes = minutes % 525600;
        long days = remainingMinutes / 1440;

        String yearsFormatted = String.valueOf(years < 10 ? String.format("%02d", years) : years);
        String daysFormatted = String.valueOf(years < 10 ? String.format("%02d", days) : days);
        String minsFormatted = String.valueOf(years < 10 ? String.format("%02d", remainingMinutes) : remainingMinutes);

        System.out.println(minutes + " min = " + yearsFormatted + " y and " + daysFormatted + " d");
    }
}
