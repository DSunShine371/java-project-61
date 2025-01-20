package hexlet.code;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Const.MAX_COUNT_OF_ROUND;

public abstract class Engine {
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Starts the process.
     *
     * <p>
     * This method is not intended to be overridden in subclasses.
     * It performs the function of managing game scripts.
     * </p>
     */
    public void start() {
        Greet.greetings();
        printRules();
        int countOfRound = 0;
        while (countOfRound < MAX_COUNT_OF_ROUND) {
            String correctAnswer = askQuestionAndReturnAnswer();
            String userAnswer = scanner.nextLine();
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

    /**
     * Generates a random integer between 1 and the specified maximum value.
     *
     * <p>
     * This method can be overridden in subclasses if different randomization logic is needed.
     * </p>
     *
     * @param maxValue the upper bound (exclusive) for the random number generation
     * @return a random integer between 1 and maxValue (inclusive)
     */
    public int getRandom(int maxValue) {
        return random.nextInt(maxValue) + 1;
    }
}
