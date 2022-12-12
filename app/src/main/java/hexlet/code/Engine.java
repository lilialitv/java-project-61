package hexlet.code;

import java.util.Random;

public class Engine {
    public static int getRandomInt(int limit) {
        Random randomInt = new Random();
        return randomInt.nextInt(limit);
    }

    public static char getRandomOperation() {
        Random randomChar = new Random();
        String setOfCharacters = "+-*";
        int randomIndex = randomChar.nextInt(setOfCharacters.length());
        return setOfCharacters.charAt(randomIndex);
    }


}
