package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Const.MAX_COUNT_OF_ROUND;

public class Engine {
    private final Scanner scanner = new Scanner(System.in);
    private int countOfRound = 0;

    /**
     * Starts the game with the given questions.
     *
     * <p>This method can be overridden in subclasses to change its behavior.</p>
     *
     * @param questions an array of questions for the game
     */
    public void start(Question[] questions) {
        while (countOfRound < MAX_COUNT_OF_ROUND) {
            printQuestion(questions[countOfRound]);
            String correctAnswer = questions[countOfRound].answer();
            String userAnswer = scanner.nextLine();
            System.out.println("Your answer: " + userAnswer);

            if (!isCorrectAnswer(correctAnswer, userAnswer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + Greet.getName() + "!");
        System.out.println();
    }

    private void printQuestion(Question question) {
        System.out.println(question.question());
    }

    private boolean isCorrectAnswer(String correctAnswer, String userAnswer) {
        if (userAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
            countOfRound++;
        } else {
            String fail = "'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.";
            System.out.println(fail);
            System.out.println("Let's try again, " + Greet.getName() + "!");
            return false;
        }
        return true;
    }
}
