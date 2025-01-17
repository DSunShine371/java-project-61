package hexlet.code.games;

import hexlet.code.Engine;

public final class Progression extends Engine {
    @Override
    public String askQuestionAndReturnAnswer() {
        int maxValueForStart = 10;
        int maxValueForLength = 5;
        int minValueForLength = 5;
        int maxValueForProgressionStep = 5;
        int minValueForProgressionStep = 1;
        int startNum = getRandom(maxValueForStart);
        int arrayLength = minValueForLength + getRandom(maxValueForLength);
        int progressionStep = minValueForProgressionStep + getRandom(maxValueForProgressionStep);

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
