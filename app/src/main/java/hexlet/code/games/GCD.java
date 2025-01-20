package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Const.GAME_RULES_GCD;
import static hexlet.code.Const.MAX_VALUE_FOR_GCD_NUMBERS;


public final class GCD extends Engine {
    @Override
    public String askQuestionAndReturnAnswer() {
        int num1 = getRandom(MAX_VALUE_FOR_GCD_NUMBERS);
        int num2 = getRandom(MAX_VALUE_FOR_GCD_NUMBERS);
        int correctAnswer;

        boolean check = false;
        while (!check) {
            if ((num1 % 2 == 0 && num2 % 2 != 0) || (num1 % 2 != 0 && num2 % 2 == 0)) {
                num2 = getRandom(MAX_VALUE_FOR_GCD_NUMBERS);
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
        System.out.println(GAME_RULES_GCD);
    }
}
