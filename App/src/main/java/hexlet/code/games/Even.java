package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Even extends Engine {
    private Random random = new Random();
    @Override
    public String askQuestionAndReturnAnswer() {
        int randomNumber = random.nextInt(20) + 1;
        System.out.println("Question: " + randomNumber);
        boolean isEven = randomNumber % 2 == 0;
        String correctAnswer = isEven ? "yes" : "no";
        return correctAnswer;
    }

    @Override
    public void printRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
