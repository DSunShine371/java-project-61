package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

import static hexlet.code.Const.GAME_OPTION_EXIT;
import static hexlet.code.Const.GAME_OPTION_GREET;
import static hexlet.code.Const.GAME_OPTION_EVEN;
import static hexlet.code.Const.GAME_OPTION_CALC;
import static hexlet.code.Const.GAME_OPTION_GCD;
import static hexlet.code.Const.GAME_OPTION_PROGRESSION;
import static hexlet.code.Const.GAME_OPTION_PRIME;
import static hexlet.code.Const.MAX_GAME_OPTIONS;

public class App {
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
                even.game();
                break;
            case GAME_OPTION_CALC:
                calc.game();
                break;
            case GAME_OPTION_GCD:
                gcd.game();
                break;
            case GAME_OPTION_PROGRESSION:
                progression.game();
                break;
            case GAME_OPTION_PRIME:
                prime.game();
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
