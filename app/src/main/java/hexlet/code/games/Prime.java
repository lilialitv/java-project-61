package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;

public class Prime {
    public static void playGame() {
        Greet.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        var questions = new String[3];
        var results = new String[3];

        for (var i = 0; i < questions.length; i++) {
            int random = Engine.getRandomInt();
            questions[i] = "Question: " + random;
            results[i] = Engine.isPrime(random) ? "yes" : "no";
        }
        Engine.gameEngine(questions, results);
    }
}
