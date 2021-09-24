package ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Let's play Guess the Number!");
        double answer = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        int totalGuesses = 0;
        int level;

        while(true){
            System.out.print("Enter the difficulty level (1, 2, or  3): ");
            level = input.nextInt();

            if(level==1){
                answer = (int) (Math.random() * 10 + 1);//Number between 1 and 10.
            }
            else if(level==2){
                answer = (int) (Math.random() * 100 + 1);//Number between 1 and 100.
            }
            else if(level==3) {
                answer = (int) (Math.random() * 1000 + 1);//Number between 1 and 1000.
            }

            System.out.print("I have my number. What's your guess?: ");

            do{
                guess = input.nextInt();//Take user guess.
                totalGuesses++; //Counting the guesses.
                if (guess == answer){
                    System.out.println("You got it in "+totalGuesses+" guesses!");
                    }
                else if (guess < answer){
                    System.out.println("Too low. Guess again:");
                }
                else if (guess > answer){
                    System.out.println("Too high. Guess again:");
                }
            } while (guess != answer);
                System.out.print("Do you wish to play again (Y/N)? ");
                char response = input.next().charAt(0);
                if(response == 'N' || response == 'n') {
                System.exit(1);
                }
            }
        }
}

