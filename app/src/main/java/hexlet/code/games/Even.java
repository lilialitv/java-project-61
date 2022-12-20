package hexlet.code.games;

import hexlet.code.Greet;
import hexlet.code.Engine;

public class Even {
    public static void playGame() {
        Greet.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var array = new String[6];
        for (var i = 0; i < array.length; i = i + 2) {
            int random = Engine.getRandomInt();
            array[i] = "Question: " + random;
            array[i + 1] = random % 2 == 0 ? "yes" : "no";
        }
        Engine.gameEngine(array);
    }
}
