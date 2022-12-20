package hexlet.code.games;

import hexlet.code.Greet;
import hexlet.code.Engine;

public class Calc {
    private static final  int NUMBER_OF_ROUNDS = 3;
    public static void playGame() {
        Greet.greeting();
        System.out.println("What is the result of the expression?");
        var questions = new String[NUMBER_OF_ROUNDS];
        var results = new String[NUMBER_OF_ROUNDS];

        for (var i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int number1 = Engine.getRandomInt();
            int number2 = Engine.getRandomInt();
            char operation = Engine.getRandomOperation("-+*");
            questions[i] = Engine.formQuestion(number1, number2, operation);
            results[i] = Engine.count(number1, number2, operation);
        }
        Engine.gameEngine(questions, results);
    }
}
