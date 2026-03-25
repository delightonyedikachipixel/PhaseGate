

import java.util.Scanner;
import java.util.Random;

public class GuessingRandomNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int correctCount = 0;
        int failCount = 0;
        int numberOfAttempts = 5;
        int attempts = 0;

        int correctAnswer = generateRandomNumber();

        System.out.println("Welcome to Random Guessing Game");

        while (attempts < numberOfAttempts) {

            int userAnswer = getUserGuess(input);

            
            

            if (checkGuess(userAnswer, correctAnswer)) {
                System.out.println("Correct!");
                correctCount++;
                break;
            } else {
                attempts++;
                System.out.println("Wrong!");
                giveHint(userAnswer);
            }
        }

        if (attempts == numberOfAttempts) {
            System.out.println("The correct answer is " + correctAnswer);
            failCount++;
        }

        displayResults(correctCount, failCount, attempts, numberOfAttempts);
    }

    
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(1, 101);
    }

    
    public static int getUserGuess(Scanner input) {
        System.out.print("Guess a number (1 - 100): ");

        if (!input.hasNextInt()) {
            System.out.println("Invalid input!! Please enter a number.");
            input.next(); 
            return -1;
        }

        int guess = input.nextInt();

        if (guess < 1 || guess > 100) {
            System.out.println("Enter a number between 1 and 100.");
            return -1;
        }

        return guess;
    }

    
    public static boolean checkGuess(int userAnswer, int correctAnswer) {
        return userAnswer == correctAnswer;
    }

    
    public static void giveHint(int userAnswer) {
        if (userAnswer < 10) {
            System.out.println("no win = Better Luck");
        } else if (userAnswer < 25) {
            System.out.println("close");
        } else if (userAnswer < 50) {
            System.out.println("good");
        } else if (userAnswer < 75) {
            System.out.println("excellent");
        } else {
            System.out.println("Legendary");
        }
    }

    
    public static void displayResults(int correctCount, int failCount, int attempts, int maxAttempts) {
        System.out.println("\nGame Over!");
        System.out.println("Total Correct: " + correctCount);
        System.out.println("Total Failed: " + failCount);
        System.out.println("Attempts used: " + attempts + "/" + maxAttempts);
    }
}
