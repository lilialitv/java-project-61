package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;

public class Progression {
    private static final  int NUMBER_OF_ROUNDS = 3;
    public static void playGame() {
        Greet.greeting();
        System.out.println("What number is missing in the progression?");
        var questions = new String[NUMBER_OF_ROUNDS];
        var results = new String[NUMBER_OF_ROUNDS];

        for (var i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int[] seq = Engine.getSequence();
            int x = Math.abs(Engine.getRandomInt(seq.length - 1));
            questions[i] = Engine.seqWithX(seq, x);
            results[i] = Integer.toString(seq[x]);
        }
        Engine.gameEngine(questions, results);
    }
}
