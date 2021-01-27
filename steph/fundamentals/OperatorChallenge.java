package com.viveros.steph.fundamentals;

public class OperatorChallenge {
    /*
        1. Create a double variable with a value of 20.00
        2. Create a second variable of type double with the value 80.00
        3. Add both numbers together and multiply by 100.00
        4. Use the remainder operator to figure out what the remainder from the result of the operation
        in step 3 and 40.00. We used the modulus or remainder on ints in the course, but we can also use it on a double
        5. Create a boolean variable that assigns the value true if the remainder in #4 is 0, or false if its not zero
        6. output the boolean variable
        7. Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true.

     */

    public static void main(String[] args) {
        double valOne = 20.00;
        double valTwo = 80.00;
        double result = (valOne + valTwo) * 100.00;
        System.out.println(result);
        double remainder = result % 40.00;
        System.out.println(remainder);
        boolean hasRemainder = remainder == 0;
        System.out.println(hasRemainder);
        if (!hasRemainder){
            System.out.println("Got some remainder");
        }

        // In the following code that I will type below, write down what parts of the code are expressions
        int scored = 100; // expression (minus data type and semicolon)
        if (scored > 99){ // expression (minus the if and ())
            System.out.println("you go the high score!"); // expression (the string)
            scored = 0; // expression


            int myVariable = 50; // statement
            myVariable++; //statement
            System.out.println("This is a statement");

        }
            boolean gameOver = true;
            int score = 800;
            int levelCompleted = 5;
            int bonus = 100;

            if (gameOver){
                int finalScore = score + (levelCompleted * bonus);
                System.out.println("Final Score is " + finalScore);
            }
            /*
            * Print out a second score in the screen with following score set 10_000
            * levelCompleted set to 8
            * bonus set to 200
            * But make sure the first prinout above still displays as well*/


        int highScore = calculateScore(true, score,  levelCompleted, bonus);
        calculateScore(false, 89,  2, 80);

        System.out.println(highScore);
    }

    public static int calculateScore(boolean isGameOver, int aScore, int theLevelCompleted, int aBonus ){
        int finalScore = -1; // -1 symbolizes searching error or value not found
        if (isGameOver){
            finalScore = aScore + (theLevelCompleted * aBonus);
            finalScore += 3000;
            System.out.println("Final Score is " + finalScore);
        }
        return finalScore;
    }
}
