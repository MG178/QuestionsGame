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

        Question firstQuestion = new Question(correctAnswer, question, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer);
        questions[0] = firstQuestion;
    }

    static {
        var question = "Назовите столицу России.";
        var firstAnswer = "Санкт-Петербург";
        var secondAnswer = "Москва";
        var thirdAnswer = "Великий Новгород";
        var fourthAnswer = "Екатеринбург";
        var correctAnswer = 2;

        Question firstQuestion = new Question(correctAnswer, question, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer);
        questions[1] = firstQuestion;
    }

    static {
        var question = "Назовите столицу Португалии.";
        var firstAnswer = "Лиссабон";
        var secondAnswer = "Коимбра";
        var thirdAnswer = "Порту";
        var fourthAnswer = "Брага";
        var correctAnswer = 1;

        Question firstQuestion = new Question(correctAnswer, question, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer);
        questions[2] = firstQuestion;
    }

    static {
        var question = "Назовите столицу Бразилии.";
        var firstAnswer = "Рио-де-Жанейро";
        var secondAnswer = "Манаус";
        var thirdAnswer = "Сан-Паулу";
        var fourthAnswer = "Бразилиа";
        var correctAnswer = 4;

        Question firstQuestion = new Question(correctAnswer, question, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer);
        questions[3] = firstQuestion;
    }

    static {
        var question = "Назовите столицу Китая.";
        var firstAnswer = "Шанхай";
        var secondAnswer = "Гуанчжоу";
        var thirdAnswer = "Пекин";
        var fourthAnswer = "Тяньцзинь";
        var correctAnswer = 3;

        Question firstQuestion = new Question(correctAnswer, question, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer);
        questions[4] = firstQuestion;
    }
}

