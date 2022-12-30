package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }

    public static void playGame() {
        var questions = new String[Engine.getNumberOfRounds()];
        var results = new String[Engine.getNumberOfRounds()];

        for (var i = 0; i < Engine.getNumberOfRounds(); i++) {
            int random = Utils.getRandomInt();
            questions[i] = "Question: " + random;
            results[i] = isEven(random);
        }
        Engine.gameEngine(questions, results, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
