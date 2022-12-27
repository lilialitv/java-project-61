package hexlet.code.games;

import hexlet.code.Greet;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void playGame() {
        Greet.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var questions = new String[Utils.getNumberOfRounds()];
        var results = new String[Utils.getNumberOfRounds()];

        for (var i = 0; i < Utils.getNumberOfRounds(); i++) {
            int random = Utils.getRandomInt();
            questions[i] = "Question: " + random;
            results[i] = random % 2 == 0 ? "yes" : "no";
        }
        Engine.gameEngine(questions, results);
    }
}
