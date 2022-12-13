package hexlet.code;

import java.util.Arrays;
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

    public static int[] getSequence() {
        int dif = getRandomInt(7);
        if (dif == 0) {
            dif = dif + 1;
        } else {
            dif = dif;
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
}
