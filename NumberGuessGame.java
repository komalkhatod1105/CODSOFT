import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int maxAttempts = 5;
        int score = 0;
        String playAgain;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int number = random.nextInt(100) + 1; // random number between 1 and 100
            int attempts = 0;
            boolean isGuessed = false;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = input.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Correct! You guessed the number in " + attempts + " attempt(s).");
                    score += (maxAttempts - attempts + 1); 
                    isGuessed = true;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }
            }

            if (!isGuessed) {
                System.out.println("You have used all your attempts.");
                System.out.println("The correct number was: " + number);
            }

            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = input.next().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("\nGame Over. Your total score is: " + score);
        System.out.println("Thank you for playing.");
        input.close();
    }
}
