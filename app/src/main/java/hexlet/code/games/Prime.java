package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Const.GAME_RULES_PRIME;
import static hexlet.code.Const.MAX_VALUE_FOR_PRIME_NUMBERS;

public final class Prime extends Engine {
    @Override
    public String askQuestionAndReturnAnswer() {
        int randomNumber = getRandom(MAX_VALUE_FOR_PRIME_NUMBERS);
        System.out.println("Question: " + randomNumber);
        return isPrime(randomNumber) ? "yes" : "no";
    }

    private static boolean isPrime(int randomNumber) {
        if (randomNumber <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(randomNumber); i++) {
            if (randomNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void printRules() {
        System.out.println(GAME_RULES_PRIME);
    }
}
