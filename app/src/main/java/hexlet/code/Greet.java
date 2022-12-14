package hexlet.code;

import java.util.Scanner;

public class Greet {
    public static String username;
    public static void greeting() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        username = myObj.nextLine();
        System.out.println("Hello, " + username + "!");
    }

    public static void congratulate() {
        System.out.println("Congratulations, " + username + "!");
    }

    public static void tryAgain() {
        System.out.println("Let's try again, " + username + "!");
    }
}
