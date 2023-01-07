package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final  int NUMBER_OF_ROUNDS = 3;

    public static int getNumberOfRounds() {
        return NUMBER_OF_ROUNDS;
    }

    public static void fail() {
        Greet.tryAgain();
        System.exit(0);
    }

    public static boolean check(String answer, String result) {

        if (result.equals(answer)) {
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
            fail();
            return false;
        }
    }

    public static void gameEngine(String[] questions, String[] results, String task) {

        Greet.greeting();
        System.out.println(task);
        Scanner sc = new Scanner(System.in);
        var answers = new String[getNumberOfRounds()];
        for (var i = 0; i < getNumberOfRounds(); i++) {
            System.out.println(questions[i]);
            System.out.println("Your answer: ");
            answers[i] = sc.nextLine();
            if (check(answers[i], results[i])) {
                System.out.println("Correct!");
            }
        }
        Greet.congratulate();
    }
}

