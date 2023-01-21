package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void playGame() {
        String[][] questionsAndResults = new String[Engine.getNumberOfRounds()][Engine.getOneQuestionOneAnswer()];
        for (var i = 0; i < Engine.getNumberOfRounds(); i++) {
            int random = Utils.getRandomInt(Utils.getDefaultMax());
            questionsAndResults[i][0] = "" + random;
            questionsAndResults[i][1] = isEven(random) ? "yes" : "no";
        }
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.gameEngine(questionsAndResults, description);
    }
}
