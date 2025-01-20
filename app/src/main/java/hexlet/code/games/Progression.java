package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Const.MAX_VALUE_FOR_START;
import static hexlet.code.Const.MIN_VALUE_FOR_LENGTH;
import static hexlet.code.Const.MAX_VALUE_FOR_LENGTH;
import static hexlet.code.Const.MIN_VALUE_FOR_PROGRESSION_STEP;
import static hexlet.code.Const.MAX_VALUE_FOR_PROGRESSION_STEP;
import static hexlet.code.Const.GAME_RULES_PROGRESSION;


public final class Progression extends Engine {

    @Override
    public String askQuestionAndReturnAnswer() {
        int startNum = getRandom(MAX_VALUE_FOR_START);
        int arrayLength = MIN_VALUE_FOR_LENGTH + getRandom(MAX_VALUE_FOR_LENGTH);
        int progressionStep = MIN_VALUE_FOR_PROGRESSION_STEP + getRandom(MAX_VALUE_FOR_PROGRESSION_STEP);

        String[] arrayNumbers = new String[arrayLength];
        arrayNumbers[0] = String.valueOf(startNum);
        for (int i = 1; i < arrayNumbers.length; i++) {
            startNum += progressionStep;
            arrayNumbers[i] = String.valueOf(startNum);
        }
        int hiddenCell = getRandom(arrayNumbers.length - 1);
        String correctAnswer = arrayNumbers[hiddenCell];
        arrayNumbers[hiddenCell] = "..";
        String arrayForQuestion = String.join(" ", arrayNumbers);
        System.out.println("Question: " + arrayForQuestion);
        return correctAnswer;
    }

    @Override
    public void printRules() {
        System.out.println(GAME_RULES_PROGRESSION);
    }
}
