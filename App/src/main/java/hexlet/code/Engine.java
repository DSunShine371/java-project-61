package hexlet.code;

public abstract class Engine {

    public void start() {
        Greet.greetings();
        printRules();
        int countOfRound = 0;
        while (countOfRound < 3) {
            String correctAnswer = askQuestionAndReturnAnswer();
            String userAnswer = Cli.readLine();
            System.out.println("Your answer: " + userAnswer);
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                countOfRound++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" +
                        correctAnswer + "'.");
            }

        }
        System.out.println("Congratulations, " + Greet.getName() + "!");
        System.out.println();

    }

    public void rules(String rule) {
        System.out.println(rule);
    }

    public abstract String askQuestionAndReturnAnswer();

    public abstract void printRules();
}
