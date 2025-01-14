package hexlet.code;

import java.util.Random;

public final class Even {
    private static Random random = new Random();

    private Even() {
        throw new IllegalStateException("Utility class");
    }

    public static void start() {
        Greet.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\n" +
                "If you want to exit - answer '0'.");
        int countOfRound = 0;

        while (countOfRound < 3) {
            int randomNumber = random.nextInt(20) + 1;
            System.out.println("Question: " + randomNumber);
            String userAnswer = Cli.readLine();

            if (userAnswer.equals("0")) {
                return;
            }

            System.out.println("Your answer: " + userAnswer);
            if (userAnswer.equals("yes") || userAnswer.equals("no")) {
                boolean isEven = randomNumber % 2 == 0;
                String correctAnswer = isEven ? "'yes'" : "'no'";

                if (isCorrect(userAnswer, isEven)) {
                    System.out.println("Correct!");
                    countOfRound++;
                } else {
                    System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" +
                            correctAnswer + "'.");
                }
            } else {
                System.out.println("Please, answer 'yes' if the number is even, otherwise answer 'no'.\n" +
                        "If you want to exit - answer '0'.");
            }
        }
        System.out.println("Congratulations, " + Greet.getName() + "!");
        System.out.println();
    }

    private static boolean isCorrect(String userAnswer, boolean isEven) {
        return (userAnswer.equals("yes") && isEven) || (userAnswer.equals("no") && !isEven);
    }
}
