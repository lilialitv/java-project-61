package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;

public class Prime {
    private static final  int NUMBER_OF_ROUNDS = 3;
    public static void playGame() {
        Greet.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        var questions = new String[NUMBER_OF_ROUNDS];
        var results = new String[NUMBER_OF_ROUNDS];

        for (var i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int random = Engine.getRandomInt();
            questions[i] = "Question: " + random;
            results[i] = Engine.isPrime(random) ? "yes" : "no";
        }
        Engine.gameEngine(questions, results);
    }
}
