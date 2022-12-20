package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    private static final  int GAME1 = 1;
    private static final  int GAME2 = 2;
    private static final  int GAME3 = 3;
    private static final  int GAME4 = 4;
    private static final  int GAME5 = 5;
    private static final  int GAME6 = 6;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.println("Your choice: ");
        int choice = scanner.nextInt();
        if (choice == GAME1) {
            Greet.greeting();
        } else if (choice == GAME2) {
            Even.playGame();
        } else if (choice == GAME3) {
            Calc.playGame();
        } else if (choice == GAME4) {
            GCD.playGame();
        } else if (choice == GAME5) {
            Progression.playGame();
        } else if (choice == GAME6) {
            Prime.playGame();
        }
    }
}
