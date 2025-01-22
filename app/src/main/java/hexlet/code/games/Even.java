package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.games.Const.GAME_RULES_EVEN;
import static hexlet.code.games.Const.MAX_VALUE_FOR_EVEN_NUMBERS;
import static hexlet.code.games.Const.MAX_COUNT_OF_ROUND;
import static hexlet.code.games.Const.NUMBER_OF_TRANSFERRED_PARAMETERS;
import static hexlet.code.Randomizer.getRandomNumber;

public final class Even {
    public void game() {
        Engine engine = new Engine();
        engine.start(generateQuestions(), GAME_RULES_EVEN);
    }

    private String[][] generateQuestions() {
        String[][] questions = new String[NUMBER_OF_TRANSFERRED_PARAMETERS][MAX_COUNT_OF_ROUND];
        for (int i = 0; i < questions[0].length; i++) {
            int randomNumber = getRandomNumber(MAX_VALUE_FOR_EVEN_NUMBERS);
            String question = "Question: " + randomNumber;
            String answer = isEven(randomNumber) ? "yes" : "no";
            questions[0][i] = question;
            questions[1][i] = answer;
        }
        return questions;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
