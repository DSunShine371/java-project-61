package hexlet.code.games;

import hexlet.code.Engine;

public final class Calc extends Engine {
    private final int num1 = getRandom(20);
    private final int num2 = getRandom(20);
    private int correctAnswer = 500;

    @Override
    public String askQuestionAndReturnAnswer() {
        System.out.print("Question: ");
        switch (getRandom(3)) {
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
