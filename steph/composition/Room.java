package com.viveros.steph.composition;

public class Room {
    private Bed bed;
    private TV tv;


    public Room(Bed bed, TV tv){
        this.bed = bed;
        this.tv = tv;
    }

    public Bed getBed() {
        return bed;
    }
    public void tidyUp(){
        if (!getBed().isBedMade()){
            getBed().changeBedMadeStatus();
        }
    }

    public TV getTv() {
        return tv;
    }
}
