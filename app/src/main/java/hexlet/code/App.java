package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    private static final int GAME_OPTION_EXIT = 0;
    private static final int GAME_OPTION_GREET = 1;
    private static final int GAME_OPTION_EVEN = 2;
    private static final int GAME_OPTION_CALC = 3;
    private static final int GAME_OPTION_GCD = 4;
    private static final int GAME_OPTION_PROGRESSION = 5;
    private static final int GAME_OPTION_PRIME = 6;
    private static final int MAX_GAME_OPTIONS = 6;

    public static void main(String[] args) {
        Even even = new Even();
        Calc calc = new Calc();
        GCD gcd = new GCD();
        Progression progression = new Progression();
        Prime prime = new Prime();

        switch (getUserChoice()) {
            case GAME_OPTION_EXIT:
                return;
            case GAME_OPTION_GREET:
                Greet.greetings();
                break;
            case GAME_OPTION_EVEN:
                even.start();
                break;
            case GAME_OPTION_CALC:
                calc.start();
                break;
            case GAME_OPTION_GCD:
                gcd.start();
                break;
            case GAME_OPTION_PROGRESSION:
                progression.start();
                break;
            case GAME_OPTION_PRIME:
                prime.start();
                break;
            default:
                System.out.println("    Error\nSomething went wrong ;)");
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
                    6 - Prime
                    0 - Exit""");
            String userInput = scanner.nextLine();

            try {
                choice = Integer.parseInt(userInput);
                if (choice >= 0 && choice <= MAX_GAME_OPTIONS) {
                    System.out.println("You selected: " + choice);
                    System.out.println();
                    return choice;
                } else {
                    System.out.println("Please enter a number between 0 and 6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("The entered option does not exist. Please enter a valid integer.");
            }
        }
    }
}
