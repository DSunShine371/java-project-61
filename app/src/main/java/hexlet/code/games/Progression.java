package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.games.Const.MAX_COUNT_OF_ROUND;
import static hexlet.code.games.Const.MAX_VALUE_FOR_START;
import static hexlet.code.games.Const.MIN_VALUE_FOR_LENGTH;
import static hexlet.code.games.Const.MAX_VALUE_FOR_LENGTH;
import static hexlet.code.games.Const.MIN_VALUE_FOR_PROGRESSION_STEP;
import static hexlet.code.games.Const.MAX_VALUE_FOR_PROGRESSION_STEP;
import static hexlet.code.games.Const.GAME_RULES_PROGRESSION;
import static hexlet.code.games.Const.NUMBER_OF_TRANSFERRED_PARAMETERS;
import static hexlet.code.Randomizer.getRandomNumber;


public final class Progression {
    public void game() {
        Engine engine = new Engine();
        engine.start(generateQuestions(), GAME_RULES_PROGRESSION);
    }

    private String[][] generateQuestions() {
        String[][] questions = new String[NUMBER_OF_TRANSFERRED_PARAMETERS][MAX_COUNT_OF_ROUND];
        for (int i = 0; i < questions[0].length; i++) {
            int startNum = getRandomNumber(MAX_VALUE_FOR_START);
            int arrayLength = MIN_VALUE_FOR_LENGTH + getRandomNumber(MAX_VALUE_FOR_LENGTH);
            int progressionStep = MIN_VALUE_FOR_PROGRESSION_STEP + getRandomNumber(MAX_VALUE_FOR_PROGRESSION_STEP);

            String[] arrayNumbers = generateProgression(arrayLength, startNum, progressionStep);
            int hiddenCell = getRandomNumber(arrayNumbers.length - 1);
            String answer = arrayNumbers[hiddenCell];
            arrayNumbers[hiddenCell] = "..";
            String question =  "Question: " + String.join(" ", arrayNumbers);
            questions[0][i] = question;
            questions[1][i] = answer;
        }
        return questions;
    }

    private String[] generateProgression(int arrayLength, int startNum, int progressionStep) {
        String[] arrayNumbers = new String[arrayLength];
        arrayNumbers[0] = String.valueOf(startNum);
        for (int p = 1; p < arrayNumbers.length; p++) {
            startNum += progressionStep;
            arrayNumbers[p] = String.valueOf(startNum);
        }
        return arrayNumbers;
    }
}
