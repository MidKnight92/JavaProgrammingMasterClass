package com.viveros.steph.fundamentals;

import java.sql.Date;
import java.time.Year;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int yearOFBirth;
        boolean hasNextInt;
        Year currentYear = Year.now();
        String yrString = String.valueOf(currentYear);
        int year = Integer.parseInt(yrString);
        int age;

        do {
            System.out.print("Enter your birth year: ");
            hasNextInt = scanner.hasNextInt();
            yearOFBirth = scanner.nextInt();
            age = year - yearOFBirth;

        } while (yearOFBirth < 0 || !hasNextInt || (age > 100));
        // hasNextInt checks if the next input entered is a int but doesnt remove it from the scanner it will check to see
        // if it qualifies as an int if it doesn't qualify the method will return false

        scanner.nextLine();
        // call next line because users press enter after applying numbers
        // Scanner is looking for a line seperator enter becomes that that is why we call it again to
        // to excepet that enter value but not do anything with it

        System.out.print("Enter your name: ");
        String input = scanner.nextLine();

        System.out.println("Your name is " + input + " and you are " + age + " years old.");
        scanner.close();
    }

}
