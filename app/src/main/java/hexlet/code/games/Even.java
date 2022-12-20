package hexlet.code.games;

import hexlet.code.Greet;
import hexlet.code.Engine;

public class Even {
    public static void playGame() {
        Greet.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var questions = new String[3];
        var results = new String[3];

        for (var i = 0; i < questions.length; i++) {
            int random = Engine.getRandomInt();
            questions[i] = "Question: " + random;
            results[i] = random % 2 == 0 ? "yes" : "no";
        }
        Engine.gameEngine(questions, results);
    }
}
