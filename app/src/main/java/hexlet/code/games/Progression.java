package hexlet.code.games;

import hexlet.code.Engine;

public final class Progression extends Engine {
    private static final int MAX_VALUE_FOR_START = 10;
    private static final int MAX_VALUE_FOR_LENGTH = 5;
    private static final int MIN_VALUE_FOR_LENGTH = 5;
    private static final int MAX_VALUE_FOR_PROGRESSION_STEP = 5;
    private static final int MIN_VALUE_FOR_PROGRESSION_STEP = 1;

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
        System.out.println("What number is missing in the progression?");
    }
}
