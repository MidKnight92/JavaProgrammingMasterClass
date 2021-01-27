package com.viveros.steph.oopchallenge;

public class HealthyBurger extends Hamburger{
    private final static int ADDITION_LIMIT = 6;
    private int additionCount = 1;
    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;
    private String addition5;
    private  String addition6;
    public HealthyBurger(){
        this(null, null);
    }

    public HealthyBurger(String addition5, String addition6){
        super("Brown Rye Bread Roll", "Impossible Meat", 5.00);
        this.addition5 = addition5;
        this.addition6 = addition6;
    }

    @Override
    public double getBasePrice() {
        return this.basePrice;
    }

    @Override
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

    @Override
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
            case 5:
                this.addition5 = addition;
                break;
            case 6:
                this.addition6 = addition;
                break;

        }
    }

    public String getAddition5() {
        return addition5 != null ? addition5 : NONE;
    }

    public String getAddition6() {
        return addition6 != null ? addition6 : NONE;
    }

    @Override
    protected void printItemizedReciept(){
        System.out.println("-------" + this.getClass().getSimpleName() + "-------\n" +
                "Base Price: " + getBasePrice() + "\n" +
                "Addition 1: " + getAddition1() + " $" + getAdditionPrice(getAddition1()) +  "\n" +
                "Addition 2: " + getAddition2() + " $" + getAdditionPrice(getAddition2()) + "\n" +
                "Addition 3: " + getAddition3() + " $" + getAdditionPrice(getAddition3()) + "\n" +
                "Addition 4: " + getAddition4() + " $" + getAdditionPrice(getAddition4()) + "\n" +
                "Addition 4: " + getAddition5() + " $" + getAdditionPrice(getAddition5()) + "\n" +
                "Addition 4: " + getAddition6() + " $" + getAdditionPrice(getAddition6()) + "\n" +
                "------------------------------" + "\n" +
                "Grand Total: " + getPrice()
        );
    }
}

