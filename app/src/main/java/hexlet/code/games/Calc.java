package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.games.Const.GAME_RULES_CALC;
import static hexlet.code.games.Const.MAX_COUNT_OF_ROUND;
import static hexlet.code.games.Const.MAX_VALUE_FOR_CALC_NUMBERS;
import static hexlet.code.games.Const.NUMBER_OF_TRANSFERRED_PARAMETERS;
import static hexlet.code.Randomizer.getRandomNumber;

public final class Calc {
    public void game() {
        Engine engine = new Engine();
        engine.start(generateQuestions(), GAME_RULES_CALC);
    }

    private String[][] generateQuestions() {
        String[][] questions = new String[NUMBER_OF_TRANSFERRED_PARAMETERS][MAX_COUNT_OF_ROUND];
        for (int i = 0; i < questions[0].length; i++) {
            int num1 = getRandomNumber(MAX_VALUE_FOR_CALC_NUMBERS);
            int num2 = getRandomNumber(MAX_VALUE_FOR_CALC_NUMBERS);
            int answer = 0;
            String question = "Question: ";
            switch (getRandomNumber(2)) {
                case 0:
                    answer = num1 + num2;
                    question = question + num1 + " + " + num2;
                    break;
                case 1:
                    answer = num1 - num2;
                    question = question + num1 + " - " + num2;
                    break;
                case 2:
                    answer = num1 * num2;
                    question = question + num1 + " * " + num2;
                    break;
                default:
                    System.out.println("    Error\nSomething went wrong ;)");
            }
            questions[0][i] = question;
            questions[1][i] = String.valueOf(answer);
        }
        return questions;
    }
}
