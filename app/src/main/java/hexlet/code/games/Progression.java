package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;
import java.util.Arrays;
import java.util.Scanner;

public class Progression {
    private static final double MAX = 3;
    public static void playGame() {
        Greet.greeting();
        Scanner sc = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");

        int indexRight = 0;

        while (indexRight < MAX) {
            int[] seq = Engine.getSequence();
            int length = seq.length - 1;
            int missing = Engine.getRandomInt(length);
            missing = Math.abs(missing);
            int result = seq[missing];
            String toReplace = " " + String.valueOf(seq[missing]) + " ";
            String numbers = Arrays.toString(seq);
            numbers = numbers.replace(",", "")
                    .replace("[", " ")
                    .replace("]", " ")
                    .replace(toReplace, " .. ");
            System.out.println("Question: " + numbers);
            System.out.println("Your answer: ");
            int answer = sc.nextInt();
            //String answer2 = sc.nextLine();
            //String result2 = Integer.toString(result);
            //Engine.checkYesOrNo(answer2, result2);

            Engine.checkNumber(answer, result);
            indexRight++;
        }
        if (indexRight == MAX) {
            Greet.congratulate();
        }
    }
}
