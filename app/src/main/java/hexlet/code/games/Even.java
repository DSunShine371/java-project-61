package hexlet.code.games;

import hexlet.code.Engine;

public final class Even extends Engine {
    private static final int MAX_VALUE_FOR_NUMBERS = 20;

    @Override
    public String askQuestionAndReturnAnswer() {
        int randomNumber = getRandom(MAX_VALUE_FOR_NUMBERS);
        System.out.println("Question: " + randomNumber);
        boolean isEven = randomNumber % 2 == 0;
        return isEven ? "yes" : "no";
    }

    @Override
    public void printRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
