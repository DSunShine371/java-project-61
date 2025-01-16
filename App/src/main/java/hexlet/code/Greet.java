package hexlet.code;

class Greet {
    private static String name;

    private Greet() {
        throw new IllegalStateException("Utility class");
    }

    public static void greetings() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        name = Cli.readLine();
        System.out.println("Hello, " + name + "!");
    }

    public static String getName() {
        return name;
    }
}
