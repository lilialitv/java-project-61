package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int ELEMENTS_IN_PROGRESSION = 10;

    public static String[] getSequence(int startingNumber, int dif, char operation, int length) {
        String[] strSequence = new String[length];
        int[] sequence = new int[length];
        sequence[0] = startingNumber;
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
        return numbersWithSecretElement;
    }

    public static void playGame() {
        String[][] questionsAndResults = new String[Engine.getNumberOfRounds()][Engine.getOneQuestionOneAnswer()];
        for (var i = 0; i < Engine.getNumberOfRounds(); i++) {
            int dif = Utils.getRandomInt(ELEMENTS_IN_PROGRESSION);
            dif = (dif == 0) ? dif : (dif + 1);
            int startingNumber = Utils.getRandomInt(Utils.getDefaultMax());
            char operation = Utils.getRandomOperation("-+");
            String[] sequence = getSequence(startingNumber, dif, operation, ELEMENTS_IN_PROGRESSION);
            int secretElementIndex = Math.abs(Utils.getRandomInt(sequence.length - 1));
            questionsAndResults[i][1] = sequence[secretElementIndex];
            questionsAndResults[i][0] = seqWithSecretElement(sequence, secretElementIndex);
        }
        String description = "What number is missing in the progression?";
        Engine.gameEngine(questionsAndResults, description);
    }
}
