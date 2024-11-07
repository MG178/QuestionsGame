package game;

public class Questions {
    public static Question[] questions = new Question[5];

    static {


        Question firstQuestion = new Question(2, "Назовите столицу России.", "Санкт-Петербург", "Москва", "Великий Новгород", "Екатеринбург");
        questions[0] = firstQuestion;
        Question secondQuestion = new Question(2, "Назовите столицу Португалии.", "Лиссабон", "Коимбра", "Порту", "Брага");
        questions[1] = secondQuestion;
        Question thirdlyQuestion = new Question(2, "Назовите столицу Бразилии.", "Рио-де-Жанейро", "Манаус", "Сан-Паулу", "Бразилиа");
        questions[2] = thirdlyQuestion;
        Question fourthQuestion = new Question(2, "Назовите столицу Китая.", "Шанхай", "Гуанчжоу", "Брисбен", "Мельбурн");
        questions[3] = fourthQuestion;
        Question fifthQuestion = new Question(2, "Назовите столицу Австралии.", "Сидней", "Канберра", "Пекин", "Тяньцзинь");
        questions[4] = fifthQuestion;

    }

}

