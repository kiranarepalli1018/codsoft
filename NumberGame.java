import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    private static final int MAX_ATTEMPTS=10;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rounds = 0;
        int totalScore = 0;

        System.out.println("Welcome to the Number Guessing Game");

        boolean playAgain;
        do {
            rounds++;
            int min = 1, max = 100;
            int randomNumber = random.nextInt(max - min + 1) + min;
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;

            System.out.println("\nRound " + rounds + ":");
            System.out.println("Guess the number between " + min + " and " + max + ".");

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.printf("Attempt %d/%d: ", attempts+1, MAX_ATTEMPTS);
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    totalScore += (maxAttempts - attempts + 1);
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, You've used all your attempts. The correct number was " + randomNumber + ".");
            }

            System.out.print("Do you want to play another round? (yes/no) ");
            playAgain = scanner.next().equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("\nGame Over! You played " + rounds + " rounds with a total score of " + totalScore + ".");
        System.out.println("Thanks for playing");
        scanner.close();
    }
}