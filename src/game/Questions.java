package game;

public class Questions {
    public static Question[] questions = new Question[5];
    static {
        var question = "Назовите столицу Австралии.";
        var firstAnswer = "Сидней";
        var secondAnswer = "Канберра";
        var thirdAnswer = "Брисбен";
        var fourthAnswer = "Мельбурн";
        var correctAnswer = 2;

        Question firstQuestion = new Question(correctAnswer);
        firstQuestion.setQuestion(question);
        firstQuestion.setFirstAnswer(firstAnswer);
        firstQuestion.setSecondAnswer(secondAnswer);
        firstQuestion.setThirdAnswer(thirdAnswer);
        firstQuestion.setFourthAnswer(fourthAnswer);
        questions[0] = firstQuestion;

    }
}
