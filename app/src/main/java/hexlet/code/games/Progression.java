package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;

public class Progression {

    public static void playGame() {
        Greet.greeting();
        System.out.println("What number is missing in the progression?");
        var questions = new String[3];
        var results = new String[3];

        for (var i = 0; i < questions.length; i++) {
            int[] seq = Engine.getSequence();
            int x = Math.abs(Engine.getRandomInt(seq.length - 1));
            questions[i] = Engine.seqWithX(seq, x);
            results[i] = Integer.toString(seq[x]);
        }
        Engine.gameEngine(questions, results);
    }
}
