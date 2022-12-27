package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void gameEngine(String[] questions, String[] results) {
        Scanner sc = new Scanner(System.in);
        var answers = new String[Utils.getNumberOfRounds()];
        for (var i = 0; i < Utils.getNumberOfRounds(); i++) {
            System.out.println(questions[i]);
            System.out.println("Your answer: ");
            answers[i] = sc.nextLine();
            if (Utils.check(answers[i], results[i])) {
                System.out.println("Correct!");
            }
        }
        Greet.congratulate();
    }
}

