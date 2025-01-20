package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Const.MAX_COUNT_OF_ROUND;

public class Engine {
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Starts the game with the given questions.
     *
     * <p>This method can be overridden in subclasses to change its behavior.</p>
     *
     * @param questions an array of questions for the game
     * @param rules     a string containing the rules of the game
     */
    public void start(Question[] questions, String rules) {
        Greet.greetings();
        int countOfRound = 0;
        printMessage(rules);
        while (countOfRound < MAX_COUNT_OF_ROUND) {
            printMessage(questions[countOfRound].question());
            String correctAnswer = questions[countOfRound].answer();
            String userAnswer = scanner.nextLine();
            printMessage("Your answer: " + userAnswer);
            countOfRound++;
            if (!isCorrectAnswer(correctAnswer, userAnswer)) {
                return;
            }
        }
        printMessage("Congratulations, " + Greet.getName() + "!\n");
    }

    private boolean isCorrectAnswer(String correctAnswer, String userAnswer) {
        if (userAnswer.equals(correctAnswer)) {
            printMessage("Correct!");
        } else {
            String fail = "'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.";
            printMessage(fail);
            printMessage("Let's try again, " + Greet.getName() + "!");
            return false;
        }
        return true;
    }

    private void printMessage(String message) {
        System.out.println(message);
    }
}
