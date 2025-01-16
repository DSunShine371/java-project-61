package hexlet.code;

import java.util.Random;

public abstract class Engine {
    protected Random random = new Random();

    public void start() {
        Greet.greetings();
        printRules();
        int countOfRound = 0;
        while (countOfRound < 3) {
            String correctAnswer = askQuestionAndReturnAnswer();
            String userAnswer = Cli.readLine();
            System.out.println("Your answer: " + userAnswer);
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                countOfRound++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" +
                        correctAnswer + "'.");
                System.out.println("Let's try again, " + Greet.getName() + "!");
            }

        }
        System.out.println("Congratulations, " + Greet.getName() + "!");
        System.out.println();

    }

    public abstract String askQuestionAndReturnAnswer();

    public abstract void printRules();
}
