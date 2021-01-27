package com.viveros.steph.lists;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();

        while (!quit){
            System.out.println("Enter your choice (Press 0 for choice options or 6 to quit): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }
    public static void printInstructions(){
        System.out.println("\nPress" +
                "\n\t 0 - To print choice options." +
                "\n\t 1 - To print the list of grocery items." +
                "\n\t 2 - To add an it3em to the list" +
                "\n\t 3 - To modify an item in the list." +
                "\n\t 4 - To remove an item from the list." +
                "\n\t 5 - To search an item in the list." +
                "\n\t 6 - To quit the application.");
    }
    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryList(scanner.nextLine().toLowerCase());
    }

    public static void modifyItem(){
        System.out.print("Enter item name: ");
        String item = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine().toLowerCase();

        groceryList.modifyGroceryList(item, newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item name: ");
        String item = scanner.nextLine();
        scanner.nextLine();

        groceryList.removeItem(item);
    }

    public static void searchForItem(){
        System.out.print("Enter item name: ");
        String searchItem = scanner.nextLine().toLowerCase();
        if (groceryList.onFile(searchItem)){
            System.out.println("Item " + searchItem + " was found in the grocery list.");
        } else {
            System.out.println("Item " + searchItem + " was not found in the grocery list.");
        }
    }

    public static void processArrayList(){
        // copying an array list
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        // same as above but concise assigning and declaring
        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        // Changing an Array List to a list
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
