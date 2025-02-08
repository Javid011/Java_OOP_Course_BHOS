import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] schedule = {
                {"Sunday", "ise get"},
                {"Monday", "oyun oyna"},
                {"Tuesday", "baliq tut"},
                {"Wednesday", "kitab oxu"},
                {"Thursday", "tapsiriq hell et"},
                {"Friday", "cayxanaya get"},
                {"Saturday", "axsama azfar da oyun var"}
        };

        while (true) {
            System.out.println("Please, input the day of the week:");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            boolean found = false;
            for (int i = 0; i < schedule.length; i++) {
                if (schedule[i][0].equalsIgnoreCase(input)) {
                    System.out.println("Your tasks for " + schedule[i][0] + ": " + schedule[i][1]);
                    found = true;
                    break;
                } else if (input.startsWith("change ") || input.startsWith("reschedule ")) {
                    String day = input.substring(input.indexOf(" ") + 1).trim();
                    for (int j = 0; j < schedule.length; j++) {
                        if (schedule[j][0].equalsIgnoreCase(day)) {
                            System.out.println("Please, input new tasks for " + schedule[j][0] + ":");
                            schedule[j][1] = scanner.nextLine();
                            System.out.println("Tasks updated!");
                            found = true;
                            break;
                        }
                    }
                    break;
                }
            }

            if (!found) {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
        scanner.close();
    }
}
