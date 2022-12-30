package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static String count(int number1, int number2, char operation) {
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
        var questions = new String[Engine.getNumberOfRounds()];
        var results = new String[Engine.getNumberOfRounds()];

        for (var i = 0; i < Engine.getNumberOfRounds(); i++) {
            int number1 = Utils.getRandomInt();
            int number2 = Utils.getRandomInt();
            char operation = Utils.getRandomOperation("-+*");
            questions[i] = "Question: " + number1 + " " + operation + " " + number2;
            results[i] = count(number1, number2, operation);
        }
        Engine.gameEngine(questions, results, "What is the result of the expression?");
    }
}
