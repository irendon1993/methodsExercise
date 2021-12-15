package com.company;

public class Main {

    public static void main(String[] args) {

        String playerName = "Isaac";
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        playerName ="Isaac";
        score = 1500;

        int player1Position = calculatedHighScorePosition(score);
        displayHighScorePosition(playerName,player1Position);

        playerName ="Jeeannie";
        score = 900;

        int player2Position = calculatedHighScorePosition(score);
        displayHighScorePosition(playerName,player2Position);

        playerName ="Bill";
        score = 400;

        int player3Position = calculatedHighScorePosition(score);
        displayHighScorePosition(playerName,player3Position);

        playerName ="Pipe";
        score = 50;

        int player4Position = calculatedHighScorePosition(score);
        displayHighScorePosition(playerName,player4Position);


    }

//      Create a method called displayHighScorePosition
    public static void displayHighScorePosition(String playerName,int playerPosition) {
//      It should show a players name as a parameter, and a 2nd parameter asa position in the high score table
//      You should display the player's name along with a message like "managed to get into position " and the
//      position they got and a further message " on the high score table"
//
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table");
    }

//      Create a 2nd method called calculateHighScorePosition
//      it should be sent one argument only, the player score
//      it should return an int
    public static int calculatedHighScorePosition(int playerScore) {
//
//      the return data should be
//      1 if th score is >1000
//      2 if the score is >500 and < 1000
//      3 if the score is > 100 and <500
//      4 in all other cases
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }



//      call both methods and display the results of the following
//      a score of 1500,900,400, and 50

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;

            return finalScore;
        }
            return -1;
        }
    }
