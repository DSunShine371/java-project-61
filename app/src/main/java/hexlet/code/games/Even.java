package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Const.GAME_RULES_EVEN;
import static hexlet.code.Const.MAX_VALUE_FOR_EVEN_NUMBERS;

public final class Even extends Engine {
    @Override
    public String askQuestionAndReturnAnswer() {
        int randomNumber = getRandom(MAX_VALUE_FOR_EVEN_NUMBERS);
        System.out.println("Question: " + randomNumber);
        boolean isEven = randomNumber % 2 == 0;
        return isEven ? "yes" : "no";
    }

    @Override
    public void printRules() {
        System.out.println(GAME_RULES_EVEN);
    }
}
