package hexlet.code;

import java.util.Random;

public abstract class Engine {
    private final Random random = new Random();

    /**
     * Starts the process.
     *
     * <p>
     * This method is not intended to be overridden in subclasses.
     * It performs the function of managing game scripts.
     * </p>
     */
    public void start() {
        // Launch Logic
        Greet.greetings();
        printRules();
        int maxCountOfRound = 3;
        int countOfRound = 0;
        while (countOfRound < maxCountOfRound) {
            String correctAnswer = askQuestionAndReturnAnswer();
            String userAnswer = Cli.readLine();
            System.out.println("Your answer: " + userAnswer);
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                countOfRound++;
            } else {
                String fail = "'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.";
                System.out.println(fail);
                System.out.println("Let's try again, " + Greet.getName() + "!");
                return;
            }

        }
        System.out.println("Congratulations, " + Greet.getName() + "!");
        System.out.println();

    }

    public abstract String askQuestionAndReturnAnswer();

    public abstract void printRules();

    public int getRandom(int maxValue) {
        return random.nextInt(maxValue) + 1;
    }
}
