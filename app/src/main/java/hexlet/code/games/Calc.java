package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Const.GAME_RULES_CALC;
import static hexlet.code.Const.MAX_VALUE_FOR_CALC_NUMBERS;

public final class Calc extends Engine {
    @Override
    public String askQuestionAndReturnAnswer() {
        int num1 = getRandom(MAX_VALUE_FOR_CALC_NUMBERS);
        int num2 = getRandom(MAX_VALUE_FOR_CALC_NUMBERS);
        int correctAnswer = 0;

        System.out.print("Question: ");
        switch (getRandom(2)) {
            case 0:
                correctAnswer = num1 + num2;
                System.out.println(num1 + " + " + num2);
                break;
            case 1:
                correctAnswer = num1 - num2;
                System.out.println(num1 + " - " + num2);
                break;
            case 2:
                correctAnswer = num1 * num2;
                System.out.println(num1 + " * " + num2);
                break;
            default:
                System.out.println("    Error\nSomething went wrong ;)");
        }
        return String.valueOf(correctAnswer);
    }

    @Override
    public void printRules() {
        System.out.println(GAME_RULES_CALC);
    }
}
