package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Question;

import static hexlet.code.Const.GAME_RULES_GCD;
import static hexlet.code.Const.MAX_COUNT_OF_ROUND;
import static hexlet.code.Const.MAX_VALUE_FOR_GCD_NUMBERS;
import static hexlet.code.Randomizer.getRandomNumber;

public final class GCD {
    public void game() {
        Engine engine = new Engine();
        engine.start(generateQuestions());
    }

    private Question[] generateQuestions() {
        Question[] questions = new Question[MAX_COUNT_OF_ROUND];
        for (int i = 0; i < questions.length; i++) {
            int num1 = getRandomNumber(MAX_VALUE_FOR_GCD_NUMBERS);
            int num2 = getRandomNumber(MAX_VALUE_FOR_GCD_NUMBERS);
            while (checkCorrectness(num1, num2)) {
                num2 = getRandomNumber(MAX_VALUE_FOR_GCD_NUMBERS);
            }
            String question = "Question: " + num1 + " " + num2;
            String answer = getGCD(num1, num2);
            questions[i] = new Question(question, answer, GAME_RULES_GCD);
        }
        return questions;
    }

    private String getGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return String.valueOf(num1);
    }

    private static boolean checkCorrectness(int num1, int num2) {
        return (num1 % 2 == 0 && num2 % 2 != 0) || (num1 % 2 != 0 && num2 % 2 == 0);
    }
}
