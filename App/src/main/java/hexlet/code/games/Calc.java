package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Calc extends Engine {
    private Random random = new Random();

    @Override
    public String askQuestionAndReturnAnswer() {
        int num1 = random.nextInt(20) + 1;
        int num2 = random.nextInt(20) + 1;
        int correctAnswer = 500;

        System.out.print("Question: ");
        switch (random.nextInt(3)) {
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
