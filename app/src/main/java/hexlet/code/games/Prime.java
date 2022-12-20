package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;

public class Prime {
    public static void playGame() {
        Greet.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        var array = new String[6];

        for (var i = 0; i < array.length; i = i + 2) {
            int random = Engine.getRandomInt();
            array[i] = "Question: " + random;
            array[i + 1] = Engine.isPrime(random) ? "yes" : "no";
        }
        Engine.gameEngine(array);
    }
}
