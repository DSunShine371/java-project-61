package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;
import hexlet.code.Question;

import static hexlet.code.Const.GAME_RULES_EVEN;
import static hexlet.code.Const.MAX_VALUE_FOR_EVEN_NUMBERS;
import static hexlet.code.Const.MAX_COUNT_OF_ROUND;
import static hexlet.code.Randomizer.getRandomNumber;

public final class Even {
    public void game() {
        Engine engine = new Engine();
        Greet.greetings();
        printRules();
        engine.start(generateQuestion());
    }

    private Question[] generateQuestion() {
        Question[] questions = new Question[MAX_COUNT_OF_ROUND];
        for (int i = 0; i < questions.length; i++) {
            int randomNumber = getRandomNumber(MAX_VALUE_FOR_EVEN_NUMBERS);
            String question = "Question: " + randomNumber;
            String answer = isEven(randomNumber) ? "yes" : "no";
            questions[i] = new Question(question, answer);
        }
        return questions;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public void printRules() {
        System.out.println(GAME_RULES_EVEN);
    }
}
