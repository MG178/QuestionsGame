package game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public static void startGame() {
        System.out.println("Game started.");
        showQuestions();


    }

    private static void showQuestions() {
        System.out.println(Questions.questions[0].getQuestion());
        System.out.println("--------------------------------");
        System.out.println("1. " + Questions.questions[0].getFirstAnswer());
        System.out.println("2. " + Questions.questions[0].getSecondAnswer());
        System.out.println("3. " + Questions.questions[0].getThirdAnswer());
        System.out.println("4. " + Questions.questions[0].getFourthAnswer());
        qetUserAnswer();


    }

    private static void qetUserAnswer() {
        System.out.print("Ваш ответ: ");
        try {
            Scanner scanner = new Scanner(System.in);
            var userAnswer = scanner.nextInt();
            checkAnswer(userAnswer);
        } catch (InputMismatchException Exceptions) {
            System.out.println("Неккоретно введён ответ. Попробуй ещё.");
            qetUserAnswer();
        }



    }

    private static void checkAnswer(int userAnswer) {
        if (userAnswer == Questions.questions[0].getCORRECT_NUMBER_INDEX()){
            System.out.println("Вы победили!");
        } else {
            System.out.println("Вы проиграли!");
        }


    }
}
