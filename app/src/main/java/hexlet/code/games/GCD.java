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
        int max = 3;

        while (indexRight < max) {
            int number1 = Engine.getRandomInt();
            int number2 = Engine.getRandomInt();

            System.out.println("Question: " + number1 + " " + number2);
            System.out.println("Your answer: ");
            int answer = sc.nextInt();
            int result = Engine.getNod(number1, number2);

            Engine.checkNumber(answer, result);
            indexRight++;
        }

        if (indexRight == max) {
            Greet.congratulate();
        }
    }
}

