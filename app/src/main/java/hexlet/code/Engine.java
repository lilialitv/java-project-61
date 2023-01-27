package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final  int NUMBER_OF_ROUNDS = 3;

    private static final int ONE_QUESTION_ONE_ANSWER = 2;

    public static int getNumberOfRounds() {
        return NUMBER_OF_ROUNDS;
    }

    public static int getOneQuestionOneAnswer() {
        return ONE_QUESTION_ONE_ANSWER;
    }

    public static int startPlaying(String[][] questionsAndResults, String description) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String username = scanner.nextLine();
        System.out.println("Hello, " + username + "!");
        System.out.println(description);
        scanner = new Scanner(System.in);
        var answers = new String[getNumberOfRounds()];
        for (var i = 0; i < getNumberOfRounds(); i++) {
            System.out.println("Question: " + questionsAndResults[i][0]);
            System.out.println("Your answer: ");
            answers[i] = scanner.nextLine();
            if (questionsAndResults[i][1].equals(answers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answers[i] + "' is wrong answer ;(. "
                       + "Correct answer was '" + questionsAndResults[i][1] + "'.");
                System.out.println("Let's try again, " + username + "!");
                return 0;
            }
        }
        System.out.println("Congratulations, " + username + "!");
        return 0;
    }
}
