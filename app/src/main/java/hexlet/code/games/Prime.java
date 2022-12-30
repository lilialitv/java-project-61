package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if ((n % i) == 0) {
                return  false;
            }
        }
        return true;
    }

    public static void playGame() {
        var questions = new String[Engine.getNumberOfRounds()];
        var results = new String[Engine.getNumberOfRounds()];

        for (var i = 0; i < Engine.getNumberOfRounds(); i++) {
            int random = Utils.getRandomInt();
            questions[i] = "Question: " + random;
            results[i] = isPrime(random) ? "yes" : "no";
        }
        Engine.gameEngine(questions, results, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
}
