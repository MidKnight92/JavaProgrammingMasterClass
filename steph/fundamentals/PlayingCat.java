package com.viveros.steph.fundamentals;

public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean isPlaying = false;

        // Check if summer temp between 25 & 45  or not summer temp between 25 & 35
        if ( ( summer && (temperature <= 45 &&  temperature >= 25) ) || ( !summer && (temperature <= 35 &&  temperature >= 25) ) ){
            isPlaying = true;
        }
        return isPlaying;
    }
}
