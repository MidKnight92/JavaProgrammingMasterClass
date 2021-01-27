package com.viveros.steph.Bank;

/* better practice to assign values using the "this.accountNumber" text vs setter because subclasses might not work with the setter code within a constructor */

public class BankAccount {
    /* State */
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    /* Constructor */
    public BankAccount(){
       /* Empty constructor that calls another constructor can  only be the first thing returned */
        this(34243243, 324, "jill", "jill@email.com", "(312)343-2323");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(342342, 100, customerName, email , phoneNumber);
    }

    public BankAccount(int accountNumber, int balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    /* Custom Methods */
    public void deposit(int depositAmount){
        System.out.println(getBalance());
        this.balance = getBalance() + depositAmount;
        System.out.println("Deposited: " + depositAmount);
    }

    public void withdraw(int withdrawAmount){
        System.out.println("The current balance is " + getBalance());
        if ( ( getBalance() - withdrawAmount ) >= 0){
            this.balance = getBalance() - withdrawAmount;
            System.out.println("the amount withdrawn was " + withdrawAmount);
        } else {
            System.out.println("Insufficient funds");
        }

    }


    /* Getters and Setters */
    public void setAccountNumber(int anAccountNumber){
        this.accountNumber = anAccountNumber;
    }

    public void setBalance(int aBalance){
        this.balance = aBalance;
    }

    public void setCustomerName(String theCustomerName){
        this.customerName = theCustomerName;
    }

    public void setEmail(String anEmail){
        this.email = anEmail;
    }

    public void setPhoneNumber(String aPhoneNumber){
        this.phoneNumber = aPhoneNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public int getBalance(){
        return balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        return  phoneNumber;
    }
}
