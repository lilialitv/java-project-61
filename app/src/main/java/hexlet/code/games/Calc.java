package hexlet.code.games;

import hexlet.code.Greet;
import hexlet.code.Engine;

public class Calc {
    public static void playGame() {
        Greet.greeting();
        System.out.println("What is the result of the expression?");
        var questions = new String[3];
        var results = new String[3];

        for (var i = 0; i < questions.length; i++) {
            int number1 = Engine.getRandomInt();
            int number2 = Engine.getRandomInt();
            char operation = Engine.getRandomOperation("-+*");
            questions[i] = Engine.formQuestion(number1, number2, operation);
            results[i] = Engine.count(number1, number2, operation);
        }
        Engine.gameEngine(questions, results);
    }
}
