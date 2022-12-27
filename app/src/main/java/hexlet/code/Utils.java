package hexlet.code;

import java.util.Random;

public class Utils {
    private static final int DEFAULT = 100;

    private static final  int NUMBER_OF_ROUNDS = 3;

    public static int getNumberOfRounds() {
        return NUMBER_OF_ROUNDS;
    }
    public static int getRandomInt() {
        Random randomInt = new Random();
        return randomInt.nextInt(DEFAULT);
    }

    public static char getRandomOperation(String string) {
        Random randomChar = new Random();
        int randomIndex = randomChar.nextInt(string.length());
        return string.charAt(randomIndex);
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
}
