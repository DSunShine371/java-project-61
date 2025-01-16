package hexlet.code.games;

import hexlet.code.Engine;

public final class Prime extends Engine {
    @Override
    public String askQuestionAndReturnAnswer() {
        int randomNumber = random.nextInt(61) + 1;
        System.out.println("Question: " + randomNumber);
        boolean isPrime = true;
        String correctAnswer;
        if (randomNumber <= 1) {
            return "no";
        }
        for (int i = 2; i <= Math.sqrt(randomNumber); i++) {
            if (randomNumber % i == 0) {
                isPrime = false;
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
