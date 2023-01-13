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

        String questionsAndResults[][] = new String[Engine.getNumberOfRounds()][Engine.getOneQuestionOneAnswer()];

        for (var i = 0; i < Engine.getNumberOfRounds(); i++) {
            int random = Utils.getRandomInt(Utils.getDefaultMax());
            questionsAndResults[i][0] = "" + random;
            questionsAndResults[i][1] = isPrime(random) ? "yes" : "no";
        }
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.gameEngine(questionsAndResults, description);
    }
}
