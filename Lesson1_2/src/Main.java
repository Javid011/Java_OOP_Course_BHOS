import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[][] field = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                field[i][j] = '-';
            }
        }

        int targetRow = random.nextInt(5);
        int targetCol = random.nextInt(5);

        System.out.println("All set. Get ready to rumble!");

        while (true) {
            int row = getValidInput(scanner, "Enter row (1-5): ") - 1;
            int col = getValidInput(scanner, "Enter column (1-5): ") - 1;

            if (row == targetRow && col == targetCol) {
                field[row][col] = 'x';
                printField(field);
                System.out.println("You have won!");
                break;
            } else {
                field[row][col] = '*';
                printField(field);
            }
        }
    }

    private static int getValidInput(Scanner scanner, String message) {
        int num;
        while (true) {
            System.out.print(message);
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next();
            }
            num = scanner.nextInt();
            if (num >= 1 && num <= 5) break;
            System.out.println("Number out of range. Enter a number between 1 and 5.");
        }
        return num;
    }

    private static void printField(char[][] field) {
        System.out.println("  1 2 3 4 5");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 5; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}
