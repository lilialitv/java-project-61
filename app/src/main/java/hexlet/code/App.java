package hexlet.code;


import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.println("Your choice: ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            Cli.greeting();
        } else if (choice.equals("2")) {
            Even.playGame();
        } else if (choice.equals("3")) {
            Calc.playGame();
        }
    }
}
