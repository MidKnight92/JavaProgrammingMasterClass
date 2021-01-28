package com.viveros.steph.controlflowchallenges;

public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(2,1,5));
        System.out.println(canPack(0,13,12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        // validate parameters
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        // amount of kilos in each big bag
        final int BIG_KILOS = 5;

        // total kilos for big bag
        int totalKilosForBigBags = BIG_KILOS * bigCount;

        // combined total (small 1kil0)
        int totalKilos = totalKilosForBigBags + smallCount;

        if( totalKilos < goal){
            return false;
        } else return goal % BIG_KILOS <= smallCount;
    }
}
