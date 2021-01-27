package com.viveros.steph.encapChallenge;

public class Printer {
    // Fields
    private String name;
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(String name, int tonerLevel, int numberOfPagesPrinted, boolean duplexPrinter){
        this.name = name;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.duplexPrinter = duplexPrinter;
        this.tonerLevel = validateTonerLevels(tonerLevel);

    }

    private int validateTonerLevels(int tonerLevel){
        if ( tonerLevel < 0 || tonerLevel > 100){
            return -1;
        } else {
            return tonerLevel;
        }
    }

    // methods
    public void refillToner(){
        if (getTonerLevel() < 100 ){
            this.tonerLevel = 100;
        } else {
            System.out.println("Toner level is at 100 capacity");
        }
    }

    public void printPages(int numOfPages){
        int halfNumOfPages = (numOfPages / 2);

        if ( (numOfPages % 2 == 0) && isDuplexPrinter()){
            this.numberOfPagesPrinted = getNumberOfPagesPrinted() + halfNumOfPages;
            decreaseTonerLevel(halfNumOfPages);
        } else {
            if (isDuplexPrinter()){
                this.numberOfPagesPrinted = halfNumOfPages + (numOfPages % 2);
                decreaseTonerLevel(halfNumOfPages + (numOfPages % 2));
            } else {
                this.numberOfPagesPrinted = getNumberOfPagesPrinted() + numOfPages;
                decreaseTonerLevel(numOfPages);
            }
        }
    }

    private void decreaseTonerLevel(int numOfPages){
        this.tonerLevel = getTonerLevel() - numOfPages;
    }

    // Getters
    public String getName() {
        return name;
    }

    private int getTonerLevel() {
        return tonerLevel;
    }

    public String getTonerLevelStats(){
        return tonerLevel == -1 ? "0" : String.valueOf(getTonerLevel());
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
    public void getStatus(){
        System.out.println(getName() + " has toner level at " + getTonerLevelStats() + " and has printed " + getNumberOfPagesPrinted() + " thus far.");
    }
}
