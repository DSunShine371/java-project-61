package hexlet.code;

public class Const {
    private Const() {
        throw new UnsupportedOperationException("Const class cannot be instantiated");
    }

    public static final int MAX_VALUE_FOR_START = 10;
    public static final int MAX_VALUE_FOR_LENGTH = 5;
    public static final int MIN_VALUE_FOR_LENGTH = 5;
    public static final int MAX_VALUE_FOR_PROGRESSION_STEP = 5;
    public static final int MIN_VALUE_FOR_PROGRESSION_STEP = 1;

    public static final int MAX_VALUE_FOR_PRIME_NUMBERS = 61;

    public static final int MAX_VALUE_FOR_GCD_NUMBERS = 50;

    public static final int MAX_VALUE_FOR_EVEN_NUMBERS = 20;

    public static final int MAX_VALUE_FOR_CALC_NUMBERS = 20;

    public static final int MAX_COUNT_OF_ROUND = 3;

    public static final int GAME_OPTION_EXIT = 0;
    public static final int GAME_OPTION_GREET = 1;
    public static final int GAME_OPTION_EVEN = 2;
    public static final int GAME_OPTION_CALC = 3;
    public static final int GAME_OPTION_GCD = 4;
    public static final int GAME_OPTION_PROGRESSION = 5;
    public static final int GAME_OPTION_PRIME = 6;
    public static final int MAX_GAME_OPTIONS = 6;

    public static final String GAME_RULES_EVEN = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final String GAME_RULES_CALC = "What is the result of the expression?";
    public static final String GAME_RULES_GCD = "Find the greatest common divisor of given numbers.";
    public static final String GAME_RULES_PROGRESSION = "What number is missing in the progression?";
    public static final String GAME_RULES_PRIME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
}
