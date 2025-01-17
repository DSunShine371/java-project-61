package hexlet.code.games;

import hexlet.code.Engine;

public final class Progression extends Engine {
    private int startNum = getRandom(10);
    private final int arrayLength = 5 + getRandom(5);
    private final int progressionStep = getRandom(15);
    @Override
    public String askQuestionAndReturnAnswer() {
        String[] arrayNumbers = new String[arrayLength];
        arrayNumbers[0] = String.valueOf(startNum);
        for (int i = 1; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = String.valueOf(startNum + progressionStep);
            startNum += progressionStep;
        }
        int hiddenCell = getRandom(arrayNumbers.length);
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
