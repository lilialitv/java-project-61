package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;

public class GCD {
    public static void playGame() {
        Greet.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        var array = new String[6];

        for (var i = 0; i < array.length; i = i + 2) {
            int number1 = Engine.getRandomInt();
            int number2 = Engine.getRandomInt();
            array[i] = "Question: " + number1 + " " + number2;
            array[i + 1] = Integer.toString(Engine.getNod(number1, number2));
        }
        Engine.gameEngine(array);
    }
}

