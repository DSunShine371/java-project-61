package hexlet.code.games;

import hexlet.code.Engine;

public final class Calc extends Engine {
    private static final int MAX_VALUE_FOR_NUMBERS = 20;
    private int correctAnswer;

    @Override
    public String askQuestionAndReturnAnswer() {
        int num1 = getRandom(MAX_VALUE_FOR_NUMBERS);
        int num2 = getRandom(MAX_VALUE_FOR_NUMBERS);

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
        System.out.println("What is the result of the expression?");
    }
}
