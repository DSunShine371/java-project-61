package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Question;

import static hexlet.code.Const.MAX_COUNT_OF_ROUND;
import static hexlet.code.Const.MAX_VALUE_FOR_START;
import static hexlet.code.Const.MIN_VALUE_FOR_LENGTH;
import static hexlet.code.Const.MAX_VALUE_FOR_LENGTH;
import static hexlet.code.Const.MIN_VALUE_FOR_PROGRESSION_STEP;
import static hexlet.code.Const.MAX_VALUE_FOR_PROGRESSION_STEP;
import static hexlet.code.Const.GAME_RULES_PROGRESSION;
import static hexlet.code.Randomizer.getRandomNumber;


public final class Progression {
    public void game() {
        Engine engine = new Engine();
        engine.start(generateQuestion());
    }

    private Question[] generateQuestion() {
        Question[] questions = new Question[MAX_COUNT_OF_ROUND];
        for (int i = 0; i < questions.length; i++) {
            int startNum = getRandomNumber(MAX_VALUE_FOR_START);
            int arrayLength = MIN_VALUE_FOR_LENGTH + getRandomNumber(MAX_VALUE_FOR_LENGTH);
            int progressionStep = MIN_VALUE_FOR_PROGRESSION_STEP + getRandomNumber(MAX_VALUE_FOR_PROGRESSION_STEP);

            String[] arrayNumbers = new String[arrayLength];
            arrayNumbers[0] = String.valueOf(startNum);
            for (int p = 1; p < arrayNumbers.length; p++) {
                startNum += progressionStep;
                arrayNumbers[p] = String.valueOf(startNum);
            }
            int hiddenCell = getRandomNumber(arrayNumbers.length - 1);
            String answer = arrayNumbers[hiddenCell];
            arrayNumbers[hiddenCell] = "..";
            String question =  "Question: " + String.join(" ", arrayNumbers);
            questions[i] = new Question(question, answer, GAME_RULES_PROGRESSION);
        }
        return questions;
    }
}
