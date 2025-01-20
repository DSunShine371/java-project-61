package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Const.GAME_RULES_GCD;
import static hexlet.code.Const.MAX_VALUE_FOR_GCD_NUMBERS;

public final class GCD extends Engine {
    @Override
    public String askQuestionAndReturnAnswer() {
        int num1 = getRandom(MAX_VALUE_FOR_GCD_NUMBERS);
        int num2 = getRandom(MAX_VALUE_FOR_GCD_NUMBERS);
        while (checkCorrectness(num1, num2)) {
            num2 = getRandom(MAX_VALUE_FOR_GCD_NUMBERS);
        }
        System.out.println("Question: " + num1 + " " + num2);
        return getGCD(num1, num2);
    }

    private String getGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return String.valueOf(num1);
    }

    private static boolean checkCorrectness(int num1, int num2) {
        return (num1 % 2 == 0 && num2 % 2 != 0) || (num1 % 2 != 0 && num2 % 2 == 0);
    }

    @Override
    public void printRules() {
        System.out.println(GAME_RULES_GCD);
    }
}
