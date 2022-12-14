package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int ARRAY = 10;

    public static String[] getSequence(int startingNumber, int dif, int length) {

        String[] strSequence = new String[length];
        int[] sequence = new int[length];
        sequence[0] = startingNumber;
        char operation = Utils.getRandomOperation("-+");

        for (var i = 1; i < sequence.length; i++) {
            if (operation == '-') {
                sequence[i] = sequence[i - 1] - dif;
            } else if (operation == '+') {
                sequence[i] = sequence[i - 1] + dif;
            }
        }

        for (int k = 0; k < strSequence.length; k++) {
            strSequence[k] = String.valueOf(sequence[k]);
        }
        return strSequence;
    }

    public static String seqWithSecretElement(String[] sequence, int secretElement) {

        sequence[secretElement] = "..";
        String numbersWithSecretElement = String.join(" ", sequence);
        return ("Question: " + numbersWithSecretElement);
    }

    public static void playGame() {

        var questions = new String[Engine.getNumberOfRounds()];
        var results = new String[Engine.getNumberOfRounds()];

        for (var i = 0; i < Engine.getNumberOfRounds(); i++) {
            int dif = Utils.getRandomInt(ARRAY);
            dif = (dif == 0) ? dif : (dif + 1);
            int startingNumber = Utils.getRandomInt(Utils.getDefaultMax());
            String[] sequence = getSequence(startingNumber, dif, ARRAY);
            int secretElementIndex = Math.abs(Utils.getRandomInt(sequence.length - 1));

            results[i] = sequence[secretElementIndex];
            questions[i] = seqWithSecretElement(sequence, secretElementIndex);
        }
        Engine.gameEngine(questions, results, "What number is missing in the progression?");
    }
}
