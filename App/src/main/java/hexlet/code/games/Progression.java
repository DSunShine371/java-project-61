package hexlet.code.games;

import hexlet.code.Engine;

public final class Progression extends Engine {
    @Override
    public String askQuestionAndReturnAnswer() {
        int startNum = random.nextInt(10) + 1;
        String[] arrayNumbers = new String[5 + random.nextInt(6)];
        arrayNumbers[0] = String.valueOf(startNum);
        int progressionStep = 0;
        switch (random.nextInt(3)) {
            case 0:
                progressionStep = random.nextInt(5) + 1;
                for (int i = 1; i < arrayNumbers.length; i++) {
                    arrayNumbers[i] = String.valueOf(startNum + progressionStep);
                    startNum+= progressionStep;
                }
                break;
            case 1:
                progressionStep = random.nextInt(5) + 1;
                for (int i = 1; i < arrayNumbers.length; i++) {
                    arrayNumbers[i] = String.valueOf(startNum + progressionStep);
                    startNum+= progressionStep;
                    progressionStep++;
                }
                break;
            case 2:
                progressionStep = random.nextInt(4) + 2;
                for (int i = 1; i < arrayNumbers.length; i++) {
                    arrayNumbers[i] = String.valueOf(startNum * progressionStep);
                    startNum*= progressionStep;
                }
                break;
            default:
                System.out.println("    Error\nSomething went wrong ;)");
        }
        int hiddenCell = random.nextInt(arrayNumbers.length);
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
