package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.games.Const.GAME_RULES_GCD;
import static hexlet.code.games.Const.MAX_COUNT_OF_ROUND;
import static hexlet.code.games.Const.MAX_VALUE_FOR_GCD_NUMBERS;
import static hexlet.code.games.Const.NUMBER_OF_TRANSFERRED_PARAMETERS;
import static hexlet.code.Randomizer.getRandomNumber;

public final class GCD {
    public void game() {
        Engine engine = new Engine();
        engine.start(generateQuestions(), GAME_RULES_GCD);
    }

    private String[][] generateQuestions() {
        String[][] questions = new String[NUMBER_OF_TRANSFERRED_PARAMETERS][MAX_COUNT_OF_ROUND];
        for (int i = 0; i < questions[0].length; i++) {
            int num1 = getRandomNumber(MAX_VALUE_FOR_GCD_NUMBERS);
            int num2 = getRandomNumber(MAX_VALUE_FOR_GCD_NUMBERS);
            while (checkCorrectness(num1, num2)) {
                num2 = getRandomNumber(MAX_VALUE_FOR_GCD_NUMBERS);
            }
            String question = "Question: " + num1 + " " + num2;
            String answer = getGCD(num1, num2);
            questions[0][i] = question;
            questions[1][i] = answer;
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
