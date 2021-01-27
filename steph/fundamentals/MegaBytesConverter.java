package com.viveros.steph.fundamentals;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    // Calculate the megabytes and remaining kilobytes from the param
    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 0 ){
            System.out.println("Invalid Value");
        } else {
            int megabytes = kiloBytes / 1024;
            int remainingKilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " +  remainingKilobytes + " KB");
        }

    }
}
