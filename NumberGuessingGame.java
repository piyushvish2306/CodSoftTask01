import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");

        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int tarNum = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;

            System.out.println("I have selected a number between 1 and 100. Can you guess it?");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                scanner.nextLine();

                attempts++;

                if (guess == tarNum) {
                    System.out.println("Congratulations! You guessed the number " + tarNum + " in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (guess < tarNum) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (attempts >= maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + tarNum + ".");
            }
            break;
        }

        System.out.println("Game over! Your score: " + score);

        scanner.close();
    }
}