package hexlet.code;

import java.util.Random;

public class Engine {
    public static int getRandomInt(int limit) {
        Random randomInt = new Random();
        return randomInt.nextInt(limit);
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
    public static void checkYesOrNo(String answer, String result) {
        if (result.equals(answer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
            fail();
        }
    }

    public static void checkNumber(int answer, int result) {
        if (result == answer) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
            fail();
        }
    }

    public static int[] getSequence() {
        int dif = getRandomInt(7);
        if (dif == 0) {
            dif = dif + 1;
        }
        int[] sequence = new int[10];
        sequence[0] = getRandomInt(99);
        char operation = getRandomOperation("-+");
        for (var i = 1; i < 10; i++) {
            if (operation == '-') {
                sequence[i] = sequence[i - 1] - dif;
            } else if (operation == '+') {
                sequence[i] = sequence[i - 1] + dif;
            }
        }
        return sequence;
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
}
