package hexlet.code;

import java.util.Scanner;
public class Cli {
    public static void greeting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        sc.close();
    }
}
