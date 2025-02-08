import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(101);
        int[] guesses = new int[100];
        int attempts = 0;
        System.out.println("Let the game begin!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        while (true) {
            System.out.print("Enter your guess (0-100): ");
            int guess;
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next();
            }
            guess = scanner.nextInt();
            guesses[attempts++] = guess;
            if (guess < targetNumber) {
                System.out.println("Your number is too small. Please, try again..");
            } else if (guess > targetNumber) {
                System.out.println("Your number is too big. Please, try again..");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
        int[] enteredNumbers = Arrays.copyOf(guesses, attempts);
        Arrays.sort(enteredNumbers);
        System.out.print("Your numbers: ");
        for (int i = enteredNumbers.length - 1; i >= 0; i--) {
            System.out.print(enteredNumbers[i] + " ");
        }
    }
}