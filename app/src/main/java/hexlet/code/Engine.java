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

    public static int getNod(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return getNod(number2, number1 % number2);
    }
}
