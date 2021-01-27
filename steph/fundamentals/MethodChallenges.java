package com.viveros.steph.fundamentals;

public class MethodChallenges {
    /*
    * Create a method called displayHighScorePosition
    * it should have a players name as a parameter, and a 2nd parameter as a position in the high score table
    * you should display the players name along with a message like " managed to get into position " and the
    * position they hot and a further message " on the high score table:
    *
    * Create a 2nd method called calculateHighScorePosition
    * it should be sent one argument only, the player score
    * it should return an int
    * the return data should be
    * 1 if the score >= 1000
    * 2 if the score is >=500 and < 1000
    * 3 if the score is >= 100 and < 500
    * 4 in all other cases
    * call both methods and display the results of the following
    * a score of 1500, 900, 400, and 50
    *
    * logic check
    * test the boundary case
    * */

    // methods with void return type are also called procedure
    public static void main(String[] args) {
        displayHighScorePosition("Stephanie", calculateHighScorePosition(1000));
        displayHighScorePosition("John", calculateHighScorePosition(500));
        displayHighScorePosition("Jamie", calculateHighScorePosition(100));
        displayHighScorePosition("PHil", calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playersScore){
        int position;
        if (playersScore >= 1000){
            position = 1;
        } else if (playersScore >= 500){
            position = 2;
        } else if (playersScore >= 100){
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }

}
