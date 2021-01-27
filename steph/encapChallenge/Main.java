package com.viveros.steph.encapChallenge;

public class Main {
    public static void main(String[] args) {
        Printer hp = new Printer("hp envy", 100, 0, true);
        Printer np1 = new Printer("np envy 20", -10, 0, false);
        np1.getStatus();
        hp.printPages(11);
        System.out.println( "Pages printed" + hp.getNumberOfPagesPrinted());
        System.out.println(hp.getTonerLevelStats());
        hp.getStatus();

        np1.printPages(10);
        System.out.println(np1.getNumberOfPagesPrinted());
    }
}
