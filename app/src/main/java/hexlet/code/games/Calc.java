package hexlet.code.games;

import hexlet.code.Greet;
import hexlet.code.Engine;

public class Calc {
    public static void playGame() {
        Greet.greeting();
        System.out.println("What is the result of the expression?");
        var array = new String[6];

        for (var i = 0; i < array.length; i = i + 2) {
            int number1 = Engine.getRandomInt();
            int number2 = Engine.getRandomInt();
            char operation = Engine.getRandomOperation("-+*");
            array[i] = Engine.formQuestion(number1, number2, operation);
            array[i + 1] = Engine.count(number1, number2, operation);
        }
        Engine.gameEngine(array);
    }
}
