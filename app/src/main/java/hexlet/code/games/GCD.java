package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;

import java.util.Scanner;

public class GCD {
    public static void playGame() {
        Greet.greeting();
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");

        int indexRight = 0;
        int indexWrong = 0;

        while (indexRight < 3 && indexWrong < 1) {
            int number1 = Engine.getRandomInt(100);
            int number2 = Engine.getRandomInt(100);

            System.out.println("Question: " + number1 + " " + number2);
            System.out.println("Your answer: ");
            int answer = sc.nextInt();
            int result = Engine.getNod(number1, number2);

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
