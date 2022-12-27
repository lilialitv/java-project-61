package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    private static final  int GREETING = 1;
    private static final  int EVEN_GAME = 2;
    private static final  int CALC_GAME = 3;
    private static final  int GCD_GAME = 4;
    private static final  int PROGRESSION_GAME = 5;
    private static final  int PRIME_GAME = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.println("Your choice: ");
        int choice = scanner.nextInt();
        if (choice == GREETING) {
            Greet.greeting();
        } else if (choice == EVEN_GAME) {
            Even.playGame();
        } else if (choice == CALC_GAME) {
            Calc.playGame();
        } else if (choice == GCD_GAME) {
            GCD.playGame();
        } else if (choice == PROGRESSION_GAME) {
            Progression.playGame();
        } else if (choice == PRIME_GAME) {
            Prime.playGame();
        }
    }
}
