import java.util.Random;
import java.util.Scanner;

class HighorLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char playAgain;

        do {
            int randomNumber = random.nextInt(10) + 1;

            int userGuess;

            do {
                System.out.print("Guess the number (1-10): ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
                userGuess = scanner.nextInt();
                if (userGuess < 1 || userGuess > 10) {
                    System.out.println("Please guess a number between 1 and 10.");
                }
            } while (userGuess < 1 || userGuess > 10);

            System.out.println("The random number was: " + randomNumber);

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed it right!");
            } else if (userGuess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }

            System.out.print("Play again? (Y/N): ");
            playAgain = scanner.next().charAt(0);
        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("Thanks for playing the Number Guessing Game!");
        scanner.close();
    }
}
