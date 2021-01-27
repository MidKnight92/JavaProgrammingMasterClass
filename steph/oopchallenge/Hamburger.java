package com.viveros.steph.oopchallenge;

public class Hamburger {
    private final static int ADDITION_LIMIT = 4;
    protected final static String NONE = "N/a";
    private int additionCount = 1;
    private String breadRollType;
    private String meat;
    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;
    private double price;
    protected double basePrice;
    
    public Hamburger(String breadRollType, String meat, double price){
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.basePrice = price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public String getAddition1() {
        return addition1 != null ? addition1 : NONE;
    }

    public String getAddition2() {
        return addition2 != null ? addition2 : NONE;
    }

    public String getAddition3() {
        return addition3 != null ? addition3 : NONE;
    }

    public String getAddition4() {
        return addition4 != null ? addition4 : NONE;
    }

    public double getPrice() {
        return price;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void addAddition(String addition) {
        addition = addition.toLowerCase();

        if (additionCount <= ADDITION_LIMIT){
            switch (addition){
                case "lettuce":
                    setPrice(.50);
                    break;
                case "tomatoes":
                    setPrice(.25);
                    break;
                case "carrots":
                    setPrice(1.00);
                    break;
                default:
                    setPrice(1.25);
            }
            setAdditionVars(addition, additionCount);
            additionCount++;
        } else {
            System.out.println("Only " + ADDITION_LIMIT + " addition allowed");
        }
    }

    protected double getAdditionPrice(String addition){
        switch (addition){
            case "lettuce":
                return .50;
            case "tomatoes":
                return .25;
            case "carrots":
                return 1.00;
            default:
                return 1.25;
        }
    }

    protected void setAdditionVars(String addition, int additionCount){
        switch (additionCount){
            case 1:
                this.addition1 = addition;
                break;
            case 2:
                this.addition2 = addition;
                break;
            case 3:
                this.addition3 = addition;
                break;
            case 4:
                this.addition4 = addition;
                break;
        }
    }

    protected void setPrice(double additionPrice) {
        this.price =  getPrice() + additionPrice;
    }

    public void getBurgerDetails(){

        System.out.println(this.getClass().getSimpleName() + " has " + getBreadRollType() +
                 " and has " +  getMeat() + " meat " + "for the price of " + getPrice() + ".");
    }

    protected void printItemizedReciept(){
        System.out.println("-------" + this.getClass().getSimpleName() + "-------\n" +
                "Base Price: " + getBasePrice() + "\n" +
                "Addition 1: " + getAddition1() + " $" + getAdditionPrice(getAddition1()) +  "\n" +
                "Addition 2: " + getAddition2() + " $" + getAdditionPrice(getAddition2()) + "\n" +
                "Addition 3: " + getAddition3() + " $" + getAdditionPrice(getAddition3()) + "\n" +
                "Addition 4: " + getAddition4() + " $" + getAdditionPrice(getAddition4()) + "\n" +
                "------------------------------" + "\n" +
                "Grand Total: " + getPrice()
        );
    }
}
