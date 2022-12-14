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
        int max = 3;

        while (indexRight < max) {
            int[] seq = Engine.getSequence();
            int length = seq.length;
            int missing = Engine.getRandomInt(length);
            missing = Math.abs(missing);
            int result = seq[missing];
            String toReplace = " " + seq[missing];
            String numbers = Arrays.toString(seq);
            numbers = numbers.replace(toReplace, " ..")
                    .replace(",", "")
                    .replace("[", "")
                    .replace("]", "")
                    .trim();
            System.out.println("Question: " + numbers);
            System.out.println("Your answer: ");
            int answer = sc.nextInt();

            Engine.checkNumber(answer, result);
            indexRight++;
        }
        if (indexRight == max) {
            Greet.congratulate();
        }
    }
}
