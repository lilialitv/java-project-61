package hexlet.code.games;

import hexlet.code.Greet;
import hexlet.code.Engine;

public class Even {
    private static final  int NUMBER_OF_ROUNDS = 3;
    public static void playGame() {
        Greet.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var questions = new String[NUMBER_OF_ROUNDS];
        var results = new String[NUMBER_OF_ROUNDS];

        for (var i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int random = Engine.getRandomInt();
            questions[i] = "Question: " + random;
            results[i] = random % 2 == 0 ? "yes" : "no";
        }
        Engine.gameEngine(questions, results);
    }
}
