package hexlet.code;

import java.util.Random;

public class Utils {
    private static final int DEFAULT = 100;

    public static int getRandomInt() {
        Random randomInt = new Random();
        return randomInt.nextInt(DEFAULT);
    }

    public static char getRandomOperation(String string) {
        Random randomChar = new Random();
        int randomIndex = randomChar.nextInt(string.length());
        return string.charAt(randomIndex);
    }
}
