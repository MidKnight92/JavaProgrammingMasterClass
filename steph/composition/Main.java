package com.viveros.steph.composition;

public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed("calvin cline", "black", true);
        TV tv = new TV("Vizio", false, 00);
        Room room = new Room(bed, tv);

        room.getBed().isBedMade();
        room.tidyUp();
    }

}
