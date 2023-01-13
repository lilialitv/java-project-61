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
        switch (choice) {
            case GREETING -> {
                Scanner myObj = new Scanner(System.in);
                System.out.println("Welcome to the Brain Games!\nMay I have your name?");
                System.out.println("Hello, " + myObj.nextLine() + "!");
            }
            case EVEN_GAME -> Even.playGame();
            case CALC_GAME -> Calc.playGame();
            case GCD_GAME -> GCD.playGame();
            case PROGRESSION_GAME -> Progression.playGame();
            case PRIME_GAME -> Prime.playGame();
            default -> System.exit(0);
        }

    }
}
