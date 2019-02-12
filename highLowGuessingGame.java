import java.util.Random;
import java.util.Scanner;
public class game {
        public static void main(String args[]) {
            String playAgain;
            do {
                int guess = -1;
                Random randomNo = new Random();
                int number = randomNo.nextInt(201) - 100;
                Scanner scanner = new Scanner(System.in);
                int noGuesses = 0;
                do {
                    boolean validInput = false;
                    do {
                        System.out.println("Guess a number between -100-100: ");
                        String guessString = scanner.next();
                        try {
                            guess = Integer.parseInt(guessString);
                            validInput = true;
                        } catch (IllegalArgumentException e) {
                            System.out.printf("%nOnly integer guesses are accepted.%n%n");

                        }
                    } while(validInput == false);
                    if (guess > 100 || guess < -100) {
                        System.out.printf("%nThat number is not in the 1-10 range.%n%n");
                    } else if (guess > number) {
                        noGuesses++;
                        System.out.printf("%nToo high, try again!%n%n");
                    } else if (guess < number) {
                        noGuesses++;
                        System.out.printf("%nToo low, try again!%n%n");
                    } else {
                        noGuesses++;
                        System.out.printf("%nCorrect! Number of guesses: %s%n%n", noGuesses);
                    }
                } while (guess != number);
                System.out.println("Enter Y to play again, or anything else to quit.");
                playAgain = scanner.next();
                System.out.printf("%n");
            } while (playAgain.equalsIgnoreCase("Y"));
            System.out.println("Thank you for playing, goodbye!");
        }
}
