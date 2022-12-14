package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;

import java.util.Scanner;

public class Prime {
    private static final double MAX = 3;
    public static void playGame() {
        Greet.greeting();
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int indexRight = 0;

        while (indexRight < MAX) {
            int random = Engine.getRandomInt();
            System.out.println("Question: " + random);
            System.out.println("Your answer: ");
            String answer = sc.nextLine();
            String result = " ";

            if (Engine.isPrime(random)) {
                result = "yes";
            } else {
                result = "no";
            }

            Engine.checkYesOrNo(answer, result);
            indexRight++;

            if (indexRight == MAX) {
                Greet.congratulate();
            }
        }
    }
}
