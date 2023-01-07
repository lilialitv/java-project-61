package hexlet.code;

import java.util.Random;

public class Utils {

    private static final int DEFAULT_MAX = 100;

    public static int getDefaultMax() {
        return DEFAULT_MAX;
    }

    public static int getRandomInt(int limit) {

        Random randomInt = new Random();
        return randomInt.nextInt(limit);
    }

    public static char getRandomOperation(String string) {

        Random randomChar = new Random();
        int randomIndex = randomChar.nextInt(string.length());
        return string.charAt(randomIndex);
    }
}
