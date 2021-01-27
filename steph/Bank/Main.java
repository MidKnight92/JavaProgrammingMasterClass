package com.viveros.steph.Bank;

import com.viveros.steph.fundamentals.VipCustomer;

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.setBalance(30);
        System.out.println(b1.getBalance());
        b1.setCustomerName("Bob");
        b1.setEmail("djfsofjso@email.com");
        b1.withdraw(34);
        b1.deposit(24);
        b1.withdraw(34);
        System.out.println(b1.getBalance());

        VipCustomer v1 = new VipCustomer();
        v1.getDetails();

        VipCustomer v2 = new VipCustomer("Steph", "steph@email.com");
        v2.getDetails();

        VipCustomer v3 = new VipCustomer("Raquel", 34343, "ra1@email.com");
        v3.getDetails();
    }
}
