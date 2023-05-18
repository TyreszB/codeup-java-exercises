import java.util.Scanner;
import java.util.Random;

public class HighLow {
    static Scanner scanner = new Scanner(System.in);
    static int numGuesses = 0;

    public static void main(String[] args) {
        Random random = new Random();
        int answer = random.nextInt(100) + 1;
        playGame(answer, 1, 100);
        System.out.printf("Good guess! It took you %d guesses.\n", numGuesses);
    }

    public static String playGame(int answer, int lower, int upper) {
        System.out.printf("Guess a number between %d and %d:\n", lower, upper);
        int guess = scanner.nextInt();
        if (guess < lower || guess > upper) {
            System.out.println("Invalid input. Please enter a number between " + lower + " and " + upper + ".");
            return playGame(answer, lower, upper);
        } else {
            numGuesses++;
            if (guess == answer) {
                return "GOOD GUESS!";
            } else if (guess < answer) {
                System.out.println("HIGHER");
                return playGame(answer, guess + 1, upper);
            } else {
                System.out.println("LOWER");
                return playGame(answer, lower, guess - 1);
            }
        }
    }
}
