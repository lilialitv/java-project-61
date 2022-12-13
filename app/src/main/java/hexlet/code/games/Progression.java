package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;
import java.util.Arrays;
import java.util.Scanner;

public class Progression {
    public static void playGame() {
        Greet.greeting();
        Scanner sc = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");

        int indexRight = 0;
        int indexWrong = 0;

        while (indexRight < 3 && indexWrong < 1) {
            int[] seq = Engine.getSequence();
            int missing = Engine.getRandomInt(9);
            missing = Math.abs(missing);
            int result = seq[missing];
            seq[missing] = 555;
            String numbers = Arrays.toString(seq);
            numbers = numbers.replace("555", "..")
                    .replace(",", "")
                    .replace("[", "")
                    .replace("]", "")
                    .trim();
            System.out.println("Question is: " + numbers);
            System.out.println("Your answer: ");
            int answer = sc.nextInt();

            if (answer == result) {
                System.out.println("Correct!");
                indexRight = indexRight + 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                Greet.tryAgain();
                indexWrong = indexWrong + 1;
            }
        }
        if (indexRight == 3) {
            Greet.congratulate();
        }
    }
}
