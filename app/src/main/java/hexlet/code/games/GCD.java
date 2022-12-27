package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;
import hexlet.code.Utils;

public class GCD {
    public static int getNod(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return getNod(number2, number1 % number2);
    }

    public static void playGame() {
        Greet.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        var questions = new String[Utils.getNumberOfRounds()];
        var results = new String[Utils.getNumberOfRounds()];

        for (var i = 0; i < Utils.getNumberOfRounds(); i++) {
            int number1 = Utils.getRandomInt();
            int number2 = Utils.getRandomInt();
            questions[i] = "Question: " + number1 + " " + number2;
            results[i] = Integer.toString(getNod(number1, number2));
        }
        Engine.gameEngine(questions, results);
    }
}

