package hexlet.code.games;

import hexlet.code.Greet;
import hexlet.code.Engine;
import java.util.Scanner;

public class Calc {
    public static void playGame() {
        Greet.greeting();
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the result of the expression?");

        int indexRight = 0;

        while (indexRight < 3) {
            int number1 = Engine.getRandomInt(100);
            int number2 = Engine.getRandomInt(100);
            char operation = Engine.getRandomOperation("-+*");
            int result = 0;

            System.out.println("Question: " + number1 + " " + operation + " " + number2);
            System.out.println("Your answer: ");
            int answer = sc.nextInt();

            if (operation == '+') {
                result = number1 + number2;
            } else if (operation == '-') {
                result = number1 - number2;
            } else if (operation == '*') {
                result = number1 * number2;
            }

            Engine.checkNumber(answer, result);
            indexRight++;

            if (indexRight == 3) {
                Greet.congratulate();
            }

        }
    }
}
