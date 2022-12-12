package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {
    public static int getRandomInt() { // метод для получения случайного числа в диапазоне
        Random randomInt = new Random();
        return randomInt.nextInt(1000);
    }

    public static void playGame() {
        Greet.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Scanner sc = new Scanner(System.in);

        var indexRight = 0;
        var indexWrong = 0;

        //запускаю цикл заданий

        while (indexRight < 3 && indexWrong < 1) {

            int random = Even.getRandomInt();
            System.out.println("Question: " + random);
            System.out.println("Your answer: ");
            String answer = sc.nextLine();
            String rightAnswer = " ";

            // собираю верный ответ для сообщения об ошибке

            if (random % 2 == 0) {
                rightAnswer = "yes";
            } else {
                rightAnswer = "no";
            }

            //анализирую ответы

            if ((random % 2 == 0 && answer.equals("yes")) || (random % 2 != 0 && answer.equals("no"))) {
                System.out.println("Correct!");
                indexRight = indexRight + 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
                Greet.tryAgain();
                indexWrong = indexWrong + 1;
            }
        }

        //поздравляю после трех верных ответов

        if (indexRight == 3) {
            Greet.congratulate();
        }
    }
}
