package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static int getGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return getGCD(number2, number1 % number2);
    }

    public static void playGame() {
        String[][] questionsAndResults = new String[Engine.getNumberOfRounds()][Engine.getOneQuestionOneAnswer()];
        for (var i = 0; i < Engine.getNumberOfRounds(); i++) {
            int number1 = Utils.getRandomInt(Utils.getDefaultMax());
            int number2 = Utils.getRandomInt(Utils.getDefaultMax());
            questionsAndResults[i][0] = number1 + " " + number2;
            questionsAndResults[i][1] = Integer.toString(getGCD(number1, number2));
        }
        String description = "Find the greatest common divisor of given numbers.";
        Engine.gameEngine(questionsAndResults, description);
    }
}

