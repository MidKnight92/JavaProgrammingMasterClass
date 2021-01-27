package com.viveros.steph.arrlistchallenge;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        String[] contactInfo = null;

        while (!quit){
            mobilePhone.printOptions();
            int choice = scanner.nextInt();
            if (choice > 1 && choice < 6){
                contactInfo = gatherInfo(choice);
            }
            quit = mobilePhone.processInput(choice, contactInfo);
        }

    }

    public static String[] gatherInfo(int choice){
        String number = null;
        String numberReplacement = null;
        String firstNameReplacement = null;
        String lastNameReplacement = null;

        System.out.print("Please provide contacts first name: ");
        String firstName = scanner.next().toLowerCase();

        System.out.print("Please provide contacts last name: ");
        String lastName = scanner.next().toLowerCase();

        if (choice == 3){
            System.out.print("Please provide contacts updated first name: ");
            firstNameReplacement = scanner.next().toLowerCase();

            System.out.print("Please provide contacts updated last name: ");
            lastNameReplacement = scanner.next().toLowerCase();

            System.out.print("Please provide contacts updated phone number: ");
            numberReplacement = scanner.next();
        } else if (choice == 5 || choice == 4){
            System.out.println("Searching...");
        } else {
            System.out.print("Please provide contacts phone number: ");
            number = scanner.next();
        }

        return new String[]{firstName, lastName, number, firstNameReplacement, lastNameReplacement, numberReplacement};
    }

}
