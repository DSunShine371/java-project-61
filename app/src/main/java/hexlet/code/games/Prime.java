package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Const.GAME_RULES_PRIME;
import static hexlet.code.Const.MAX_VALUE_FOR_PRIME_NUMBERS;

public final class Prime extends Engine {
    @Override
    public String askQuestionAndReturnAnswer() {
        int randomNumber = getRandom(MAX_VALUE_FOR_PRIME_NUMBERS);
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
        System.out.println(GAME_RULES_PRIME);
    }
}
