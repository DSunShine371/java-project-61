package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while (true) {
            switch (getUserChoice()) {
                case 0:
                    return;
                case 1:
                    Greet.greetings();
                    break;
                case 2:
                    Even.start();
                    break;
                default:
                    System.out.println("    Error\nSomething went wrong ;)");
            }
        }
    }

    private static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
            String userInput = scanner.nextLine();

            try {
                choice = Integer.parseInt(userInput);
                if (choice >= 0 && choice <= 2) {
                    System.out.println("You selected: " + choice);
                    return choice;
                } else {
                    System.out.println("Please enter a number between 0 and 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("The entered option does not exist. Please enter a valid integer.");
            }
        }
    }
}
