package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;
import hexlet.code.Utils;
import java.util.Arrays;
import java.util.Random;

public class Progression {
    private static final int ARRAY = 10;

    public static int[] getSequence() {
        int dif = getRandomInt(ARRAY);
        if (dif == 0) {
            dif = dif + 1;
        }
        int[] sequence = new int[ARRAY];
        sequence[0] = Utils.getRandomInt();
        char operation = Utils.getRandomOperation("-+");
        for (var i = 1; i < sequence.length; i++) {
            if (operation == '-') {
                sequence[i] = sequence[i - 1] - dif;
            } else if (operation == '+') {
                sequence[i] = sequence[i - 1] + dif;
            }
        }
        return sequence;
    }

    public static String seqWithX(int[] sequence, int x) {
        String toReplace = " " + sequence[x] + " ";
        String numbers = Arrays.toString(sequence);
        numbers = numbers.replace(",", "")
                .replace("[", " ")
                .replace("]", " ")
                .replace(toReplace, " .. ");
        return ("Question:" + numbers);
    }

    public static int getRandomInt(int limit) {
        Random randomInt = new Random();
        return randomInt.nextInt(limit);
    }

    public static void playGame() {
        Greet.greeting();
        System.out.println("What number is missing in the progression?");
        var questions = new String[Utils.getNumberOfRounds()];
        var results = new String[Utils.getNumberOfRounds()];

        for (var i = 0; i < Utils.getNumberOfRounds(); i++) {
            int[] seq = getSequence();
            int x = Math.abs(getRandomInt(seq.length - 1));
            questions[i] = seqWithX(seq, x);
            results[i] = Integer.toString(seq[x]);
        }
        Engine.gameEngine(questions, results);
    }
}
