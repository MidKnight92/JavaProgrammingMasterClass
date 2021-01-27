package com.viveros.steph.fundamentals;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        /* Empty calls constructor with three parameters */
        this("default", 0, "default@email.com");
    }

    public VipCustomer(String name, String email){
        this(name, 0, email);
    }
    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public void getDetails(){
        System.out.println(name + " account holder eamil is " + email + " has a credit limit of " + creditLimit + "." );
    }
}
