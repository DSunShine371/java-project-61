package hexlet.code.games;

import hexlet.code.Engine;

public final class Progression extends Engine {
    @Override
    public String askQuestionAndReturnAnswer() {
        int startNum = getRandom(10);
        int arrayLength = 5 + getRandom(5);
        int progressionStep = getRandom(15);

        String[] arrayNumbers = new String[arrayLength];
        arrayNumbers[0] = String.valueOf(startNum);
        for (int i = 1; i < arrayNumbers.length; i++) {
            startNum += progressionStep;
            arrayNumbers[i] = String.valueOf(startNum);
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
