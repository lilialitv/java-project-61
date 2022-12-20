package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;

public class GCD {
    public static void playGame() {
        Greet.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        var questions = new String[3];
        var results = new String[3];

        for (var i = 0; i < questions.length; i++) {
            int number1 = Engine.getRandomInt();
            int number2 = Engine.getRandomInt();
            questions[i] = "Question: " + number1 + " " + number2;
            results[i] = Integer.toString(Engine.getNod(number1, number2));
        }
        Engine.gameEngine(questions, results);
    }
}

