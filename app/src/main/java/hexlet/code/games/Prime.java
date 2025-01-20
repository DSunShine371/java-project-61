package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Question;

import static hexlet.code.Const.GAME_RULES_PRIME;
import static hexlet.code.Const.MAX_COUNT_OF_ROUND;
import static hexlet.code.Const.MAX_VALUE_FOR_PRIME_NUMBERS;
import static hexlet.code.Randomizer.getRandomNumber;

public final class Prime extends Engine {
    public void game() {
        Engine engine = new Engine();
        engine.start(generateQuestions());
    }

    private Question[] generateQuestions() {
        Question[] questions = new Question[MAX_COUNT_OF_ROUND];
        for (int i = 0; i < questions.length; i++) {
            int randomNumber = getRandomNumber(MAX_VALUE_FOR_PRIME_NUMBERS);
            String question = "Question: " + randomNumber;
            String answer = isPrime(randomNumber) ? "yes" : "no";
            questions[i] = new Question(question, answer, GAME_RULES_PRIME);
        }
        return questions;
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
}
