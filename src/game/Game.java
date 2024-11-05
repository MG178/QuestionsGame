package game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    private static int  numberQuestions = 0;
    private static int correctResults = 0;
    public static void startGame() {
        System.out.println("Game started.");
        showQuestions();


    }

    private static void showQuestions() {
        for (int i = 0; i < Questions.questions.length; i++) {
            numberQuestions = i;
            System.out.println(Questions.questions[i].getQuestion());
            System.out.println("--------------------------------");
            System.out.println("1. " + Questions.questions[i].getFirstAnswer());
            System.out.println("2. " + Questions.questions[i].getSecondAnswer());
            System.out.println("3. " + Questions.questions[i].getThirdAnswer());
            System.out.println("4. " + Questions.questions[i].getFourthAnswer());
            qetUserAnswer();
        }
        System.out.println("Вы набрали "+correctResults+" из "+ Questions.questions.length +" правильных ответов!");

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
        if (userAnswer == Questions.questions[numberQuestions].getCORRECT_NUMBER_INDEX()) {
            System.out.println("Вы победили!");
                    correctResults += 1;
        } else {
            System.out.println("Вы проиграли!");

        }



    }


   }
