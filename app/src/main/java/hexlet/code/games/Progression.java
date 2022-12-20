package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;

public class Progression {

    public static void playGame() {
        Greet.greeting();
        System.out.println("What number is missing in the progression?");
        var array = new String[6];

        for (var i = 0; i < array.length; i = i + 2) {
            int[] seq = Engine.getSequence();
            int x = Math.abs(Engine.getRandomInt(seq.length - 1));
            array[i] = Engine.seqWithX(seq, x);
            array[i + 1] = Integer.toString(seq[x]);
        }
        Engine.gameEngine(array);
    }
}
