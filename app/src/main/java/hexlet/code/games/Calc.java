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
        int indexWrong = 0;

        while (indexRight < 3 && indexWrong < 1) {
            int number1 = Engine.getRandomInt(100);
            int number2 = Engine.getRandomInt(100);
            char operation = Engine.getRandomOperation();
            int result = 0;
            
            System.out.println("Question: " + number1 + operation + number2);
            System.out.println("Your answer: ");
            int answer = sc.nextInt();

            if (operation == '+') {
                result = number1 + number2;
            } else if (operation == '-') {
                result = number1 - number2;
            } else if (operation == '*') {
                result = number1 * number2;
            }

            if (answer == result) {
                System.out.println("Correct!");
                indexRight = indexRight + 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                Greet.tryAgain();
                indexWrong = indexWrong + 1;
            }

            if (indexRight == 3) {
                Greet.congratulate();
            }

        }
    }
}
