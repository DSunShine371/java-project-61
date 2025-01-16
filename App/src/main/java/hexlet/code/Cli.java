package hexlet.code;

import java.util.Scanner;

class Cli {
    private Cli() {
        throw new IllegalStateException("Utility class");
    }
    public static String readLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
