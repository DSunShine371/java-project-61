package hexlet.code.games;

import hexlet.code.Engine;


public final class GCD extends Engine {
    private static final int MAX_VALUE_FOR_NUMBERS = 50;

    @Override
    public String askQuestionAndReturnAnswer() {
        int num1 = getRandom(MAX_VALUE_FOR_NUMBERS);
        int num2 = getRandom(MAX_VALUE_FOR_NUMBERS);
        int correctAnswer;

        boolean check = false;
        while (!check) {
            if ((num1 % 2 == 0 && num2 % 2 != 0) || (num1 % 2 != 0 && num2 % 2 == 0)) {
                num2 = getRandom(MAX_VALUE_FOR_NUMBERS);
                continue;
            }
            check = true;
        }
        System.out.println("Question: " + num1 + " " + num2);
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        correctAnswer = num1;
        return String.valueOf(correctAnswer);
    }

    @Override
    public void printRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }
}
