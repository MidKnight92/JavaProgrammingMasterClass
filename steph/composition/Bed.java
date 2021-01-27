package com.viveros.steph.composition;

public class Bed {
    private String name;
    private String color;
    private boolean isMade;


    public Bed( String name, String color,  boolean isMade){
        this.name = name;
        this.color = color;
        this.isMade = isMade;
    }

    public String getComforter() {
        return name;
    }

    public String getColor() {
        return color;
    }


    public void changeBedMadeStatus(){
        if (!isMade){
             this.isMade = true;
        }
    }

    public boolean isBedMade(){
        return isMade;
    }
}
