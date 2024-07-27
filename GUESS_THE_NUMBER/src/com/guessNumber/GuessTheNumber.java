package com.guessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rounds = 3; // Number of rounds
        int totalScore = 0; // Total score
        
        System.out.println("Welcome to the Guess the Number Game!");
        
        for (int round = 1; round <= rounds; round++) {
            System.out.println("Round " + round);
            int numberToGuess = random.nextInt(100) + 1; // Generate random number between 1 and 100
            int attempts = 0;
            int maxAttempts = 10; // Maximum number of attempts per round
            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (1-100): ");
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess == numberToGuess) {
                    int points = 10 - attempts + 1; // Points based on the number of attempts
                    totalScore += points;
                    System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts. You earned " + points + " points.");
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Higher!");
                } else {
                    System.out.println("Lower!");
                }
                
                if (attempts == maxAttempts) {
                    System.out.println("You've reached the maximum number of attempts. The correct number was " + numberToGuess + ".");
                }
            }
            System.out.println();
        }
        
        System.out.println("Game over! Your total score is: " + totalScore);
        scanner.close();	
	}
}
