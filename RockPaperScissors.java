/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author westonnelson
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //utilities
        Scanner myScanner = new Scanner(System.in);
        Random randomGen = new Random();

        //variables . 
        int totalRounds;
        int userChoice;
        int computerChoice;
        int userScore = 0;
        int computerScore = 0;
        int playAgain = 0;
        int ties = 0;

        do {

            System.out.println("Hello and welcome to the game: Rock, Paper, Scissors.  Prepare to get crushed.");
            System.out.println("How many rounds would you like to play? (enter 1-10)");
            totalRounds = myScanner.nextInt();

            if (totalRounds > 0 && totalRounds < 11) {
                System.out.println("Alright - let's play - ready to lose?");
            } 
            else {
                System.out.println("Hmm this is an error.  See ya!");
                System.exit(0);
            }
            //This is what tells the code of the game to run however many times the user says so.
            for (int i = 0; i < totalRounds; i++) {
                System.out.println("Your pick! Type the number 1 for rock, 2 for paper, 3 for scissors..then hit enter.  I will then display my choice - 1, 2, or 3 - and we will see who won the round.");
                userChoice = myScanner.nextInt();
                computerChoice = randomGen.nextInt(3) + 1;
                System.out.println("I chose " + computerChoice + ".");

                if (userChoice == computerChoice) {
                    System.out.println("We tied.");
                    ties++;
                    System.out.println("This is the current score: " + userScore + " is your score and " + computerScore + " is my score.");
                } else if (userChoice == 1 && computerChoice == 2) {
                    System.out.println("I win!");
                    computerScore++;
                    System.out.println("This is the current score: " + userScore + " is your score and " + computerScore + " is my score.");
                } else if (userChoice == 1 && computerChoice == 3) {
                    System.out.println("You win!");
                    userScore++;
                    System.out.println("This is the current score: " + userScore + " is your score and " + computerScore + " is my score.");
                } else if (userChoice == 2 && computerChoice == 3) {
                    System.out.println("I win!");
                    computerScore++;
                    System.out.println("This is the current score: " + userScore + " is your score and " + computerScore + " is my score.");
                } else if (userChoice == 2 && computerChoice == 1) {
                    System.out.println("You win!");
                    userScore++;
                    System.out.println("This is the current score: " + userScore + " is your score and " + computerScore + " is my score.");
                } else if (userChoice == 3 && computerChoice == 2) {
                    System.out.println("You win!");
                    userScore++;
                    System.out.println("This is the current score: " + userScore + " is your score and " + computerScore + " is my score.");
                } else if (userChoice == 3 && computerChoice == 1) {
                    System.out.println("I win!");
                    computerScore++;
                    System.out.println("This is the current score: " + userScore + " is your score and " + computerScore + " is my score.");

                }
            }
            if (userScore > computerScore) {
                System.out.println("You beat me.  You probably got lucky - but congrats.");
            } else if (userScore == computerScore) {
                System.out.println("We TIED!!!");
            } else if (userScore < computerScore) {
                System.out.println("I BEAT YOU.");
            }
            
            System.out.println("Final results: Your score was " + userScore + ", my score was " + computerScore + ", and rounds ending in a tie = " + ties + ". Nice work.");

            System.out.println("Alright..now that the game is finished..would you like to play again? Enter 1 if yes and 2 if no.");
            playAgain = myScanner.nextInt();

        } while (playAgain == 1);

        System.out.println("Thanks for playing.  Goodbye.  ");

    }
}

// NEED HELP WITH
// How do you reset the score to zero when choosing to play again? The score carries over instead of being zero.
// I would like to find a way to have the inputs changed to a String of rock, paper, scissor....
// I would also like to find a way to add when user enters anything other than 1, 2, 3, that is says try again.  