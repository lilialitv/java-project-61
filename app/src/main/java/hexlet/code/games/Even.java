package hexlet.code.games;

import hexlet.code.Greet;
import hexlet.code.Engine;
import java.util.Scanner;

public class Even {

    public static void playGame() {
        Greet.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner sc = new Scanner(System.in);

        var indexRight = 0;

        while (indexRight < 3) {

            int random = Engine.getRandomInt(1000);
            System.out.println("Question: " + random);
            System.out.println("Your answer: ");
            String answer = sc.nextLine();
            String result = "o";

            // собираю верный ответ для сообщения об ошибке

            if (random % 2 == 0) {
                result = "yes";
            } else {
                result = "no";
            }

            Engine.checkYesOrNo(answer, result);
            indexRight++;
        }
        //поздравляю после трех верных ответов

        if (indexRight == 3) {
            Greet.congratulate();
        }
    }
}


