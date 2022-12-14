package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;

import java.util.Scanner;

public class Prime {
    public static void playGame() {
        Greet.greeting();
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int indexRight = 0;
        int indexWrong = 0;

        while (indexRight < 3 && indexWrong < 1) {
            int random = Engine.getRandomInt(50);
            System.out.println("Question: " + random);
            System.out.println("Your answer: ");
            String answer = sc.nextLine();
            String result = " ";

            if (Engine.isPrime(random) == true) {
                result = "yes";
            } else {
                result = "no";
            }

            if (answer.equals(result)) {
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
