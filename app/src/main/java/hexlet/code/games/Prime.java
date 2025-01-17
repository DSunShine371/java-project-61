package hexlet.code.games;

import hexlet.code.Engine;

public final class Prime extends Engine {
    private final int randomNumber = getRandom(61);
    @Override
    public String askQuestionAndReturnAnswer() {
        System.out.println("Question: " + randomNumber);
        boolean isPrime = true;
        String correctAnswer;
        if (randomNumber <= 1) {
            return "no";
        }
        for (int i = 2; i <= Math.sqrt(randomNumber); i++) {
            if (randomNumber % i == 0) {
                isPrime = false;
                break;
            }
        }
        correctAnswer = isPrime ? "yes" : "no";
        return correctAnswer;
    }

    @Override
    public void printRules() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
}
