package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static int gameNumber1 = 1;
    public static int gameNumber2 = 2;
    public static int gameNumber3 = 3;
    public static int gameNumber4 = 4;
    public static int gameNumber5 = 5;
    public static int gameNumber6 = 6;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.println("Your choice: ");
        int choice = scanner.nextInt();
        if (choice == gameNumber1) {
            Greet.greeting();
        } else if (choice == gameNumber2) {
            Even.playGame();
        } else if (choice == gameNumber3) {
            Calc.playGame();
        } else if (choice == gameNumber4) {
            GCD.playGame();
        } else if (choice == gameNumber5) {
            Progression.playGame();
        } else if (choice == gameNumber6) {
            Prime.playGame();
        }
    }
}
