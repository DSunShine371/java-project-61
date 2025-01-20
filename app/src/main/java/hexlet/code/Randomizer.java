package hexlet.code;

import java.util.Random;

public class Randomizer {
    private static final Random RANDOM = new Random();

    public static int getRandomNumber(int maxValue) {
        return RANDOM.nextInt(maxValue) + 1;
    }
}
