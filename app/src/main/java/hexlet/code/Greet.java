package hexlet.code;

import java.util.Scanner;

final class Greet {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static String name;

    private Greet() {
        throw new IllegalStateException("Utility class");
    }

    public static void greetings() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        name = SCANNER.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static String getName() {
        return name;
    }
}
