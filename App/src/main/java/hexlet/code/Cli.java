package hexlet.code;

import java.util.Scanner;

final class Cli {
    public static String readLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
