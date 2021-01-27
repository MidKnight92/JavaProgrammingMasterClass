package com.viveros.steph.linkedlists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Steph", 343222);
        Customer customer2 = customer1;

        customer2.setBalance(12.18);
        System.out.println("Balance for customer " + customer1.getBalance());

        /* no pointers
        When we do the assignment internally, Java was actually assigning the second
        * customer class to point to the first class
        * so java just saved the memory address it didn't create a separate class
        * therefore there is only one class when we set customer2 */

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        for (int i = 0; i < intList.size(); i++){
            System.out.println(i + " : " + intList.get(i));
        }

        intList.add(1, 7);
        System.out.println();

        for (int i = 0; i < intList.size(); i++){
            System.out.println(i + " : " + intList.get(i));
        }

        /* Arraylist inserting or removing values cause the list to either have to shift up or
        * down depending on the method which in turn requires a lot of cpu to achieve which can
        * slow down performance in larger applications that is where using linkedlist would prevail since nothing has
        * to move we just change the next point */
    }
}
