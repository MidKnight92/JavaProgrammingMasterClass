package com.viveros.steph.oopchallenge;

public class DeluxeBurger extends Hamburger{

    private String addition1;
    private String addition2;

    public DeluxeBurger(){
        super("Pretzel Bread", "Double Angus Beef", 8.00);
        this.addition1 = "Chips";
        this.addition2 = "Pop";
    }

    @Override
    public String getAddition1() {
        return addition1;
    }

    @Override
    public String getAddition2() {
        return addition2;
    }

    @Override
    public double getPrice(){
        return this.basePrice + getAdditionPrice(addition1) + getAdditionPrice(addition2);
    }

    @Override
    protected void printItemizedReciept(){
        System.out.println("-------" + this.getClass().getSimpleName() + "-------\n" +
                "Base Price: " + getBasePrice() + "\n" +
                "Addition 1: " + getAddition1() + " $" + getAdditionPrice(getAddition1()) +  "\n" +
                "Addition 2: " + getAddition2() + " $" + getAdditionPrice(getAddition2()) + "\n" +
                "------------------------------" + "\n" +
                "Grand Total: " + getPrice()
        );
    }
}
