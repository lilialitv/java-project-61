package hexlet.code;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static int getRandomInt(int limit) {
        Random randomInt = new Random();
        return randomInt.nextInt(limit);
    }
    private static final int DEFAULT = 100;
    public static int getRandomInt() {
        Random randomInt = new Random();
        return randomInt.nextInt(DEFAULT);
    }
    public static String count(int number1, int number2, char operation) {
        int result = 0;
        if (operation == '+') {
            result = number1 + number2;
        } else if (operation == '-') {
            result = number1 - number2;
        } else if (operation == '*') {
            result = number1 * number2;
        }
        return Integer.toString(result);
    }
    public static String formQuestion(int number1, int number2, char operation) {
        return ("Question: " + number1 + " " + operation + " " + number2);
    }

    public static char getRandomOperation(String string) {
        Random randomChar = new Random();
        int randomIndex = randomChar.nextInt(string.length());
        return string.charAt(randomIndex);
    }

    public static int getNod(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return getNod(number2, number1 % number2);
    }

    public static void fail() {
        Greet.tryAgain();
        System.exit(0);
    }
    public static boolean check(String answer, String result) {
        if (result.equals(answer)) {

            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
            fail();
            return false;
        }
    }
    private static final int ARRAY = 10;
    public static int[] getSequence() {
        int dif = getRandomInt(ARRAY);
        if (dif == 0) {
            dif = dif + 1;
        }
        int[] sequence = new int[ARRAY];
        sequence[0] = getRandomInt();
        char operation = getRandomOperation("-+");
        for (var i = 1; i < sequence.length; i++) {
            if (operation == '-') {
                sequence[i] = sequence[i - 1] - dif;
            } else if (operation == '+') {
                sequence[i] = sequence[i - 1] + dif;
            }
        }
        return sequence;
    }
    public static String seqWithX(int[] sequence, int x) {
        String toReplace = " " + sequence[x] + " ";
        String numbers = Arrays.toString(sequence);
        numbers = numbers.replace(",", "")
                .replace("[", " ")
                .replace("]", " ")
                .replace(toReplace, " .. ");
        return ("Question:" + numbers);
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if ((n % i) == 0) {
                return  false;
            }
        }
        return true;

    }
    public static void gameEngine(String[] questions, String[] results) {
        Scanner sc = new Scanner(System.in);
        System.out.println(questions[0]);
        System.out.println("Your answer: ");
        var answers = new String[3];
        answers[0] = sc.nextLine();

        for (var i = 0; Engine.check(answers[i], results[i]) && i < questions.length - 1; i++) {
            System.out.println("Correct!");
            System.out.println(questions[i + 1]);
            System.out.println("You answer: ");
            answers[i + 1] = sc.nextLine();
        }
        if (Engine.check(answers[2], results[2])) {
            System.out.println("Correct!");
            Greet.congratulate();
        }
    }
}
