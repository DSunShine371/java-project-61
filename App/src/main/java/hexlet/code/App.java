package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Even even = new Even();
        Calc calc = new Calc();
        GCD gcd = new GCD();
        Progression progression = new Progression();
        while (true) {
            switch (getUserChoice()) {
                case 0:
                    return;
                case 1:
                    Greet.greetings();
                    break;
                case 2:
                    even.start();
                    break;
                case 3:
                    calc.start();
                    break;
                case 4:
                    gcd.start();
                    break;
                case 5:
                    progression.start();
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
            System.out.println("""
                Please enter the game number and press Enter.
                    1 - Greet
                    2 - Even
                    3 - Calc
                    4 - GCD
                    5 - Progression
                    0 - Exit""");
            String userInput = scanner.nextLine();

            try {
                choice = Integer.parseInt(userInput);
                if (choice >= 0 && choice <= 5) {
                    System.out.println("You selected: " + choice);
                    System.out.println();
                    return choice;
                } else {
                    System.out.println("Please enter a number between 0 and 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("The entered option does not exist. Please enter a valid integer.");
            }
        }
    }
}
