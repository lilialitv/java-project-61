package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    public static String calculate(int number1, int number2, char operation) {
        int result = 0;
        if (operation == '+') {
            result = number1 + number2;
        } else if (operation == '-') {
            result = number1 - number2;
        } else if (operation == '*') {
            result = number1 * number2;
        }
        return Integer.toString(result);
    }

    public static void playGame() {
        String[][] questionsAndResults = new String[Engine.getNumberOfRounds()][Engine.getOneQuestionOneAnswer()];
        for (int i = 0; i < Engine.getNumberOfRounds(); i++) {
            int number1 = Utils.getRandomInt(Utils.getDefaultMax());
            int number2 = Utils.getRandomInt(Utils.getDefaultMax());
            char operation = Utils.getRandomOperation("-+*");
            questionsAndResults[i][0] = number1 + " " + operation + " " + number2;
            questionsAndResults[i][1] = calculate(number1, number2, operation);
        }
        String description = "What is the result of the expression?";
        Engine.gameEngine(questionsAndResults, description);
    }
}
