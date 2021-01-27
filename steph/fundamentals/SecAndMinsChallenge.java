package com.viveros.steph.fundamentals;

public class SecAndMinsChallenge {
    // const
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(63));
    }

    public static String getDurationString(int mins, int secs){

        String message = validateParams(mins, secs);
        if (message.equals(INVALID_VALUE_MESSAGE)){
            return message;
        }

        int hours  =  mins / 60;
        String hoursFormatted = String.valueOf(hours < 10 ? String.format("%02d", hours) : hours);

        int remaingMins = mins % 60;
        String minsFormatted = String.valueOf(remaingMins < 10 ? String.format("%02d", remaingMins) : remaingMins);

        String secsFormatted = String.valueOf(secs < 10 ? String.format("%02d", secs) : secs);

        return hoursFormatted + "h " + minsFormatted + "m " + secsFormatted + "s";
    }

    public static String getDurationString(int secs) {

        String message = validateParams(secs);
        if (message.equals(INVALID_VALUE_MESSAGE)){
            return message;
        }
        int mins = secs / 60;
        int remainingSecs = secs % 60;

        return getDurationString(mins, remainingSecs);
    }

    public static String validateParams(int mins, int secs){
        if ( ( mins < 0 ) || ( secs < 0 || secs > 60 ) ){
            return INVALID_VALUE_MESSAGE;
        }
        return "ok";
    }

    public static String validateParams( int secs){
        if (  secs < 0  ){
            return INVALID_VALUE_MESSAGE;
        }
        return "ok";
    }
}
