package game;

public class Question {
    private String question;
    private String firstAnswer;
    private String secondAnswer;
    private String thirdAnswer;
    private String fourthAnswer;
    private final int CORRECT_NUMBER_INDEX;

    public String getQuestion() {
        return question;
    }

    public int getCORRECT_NUMBER_INDEX() {
        return CORRECT_NUMBER_INDEX;
    }


    public void setQuestion(String question) {
        this.question = question;
    }

    public String getFirstAnswer() {
        return firstAnswer;
    }

    public void setFirstAnswer(String firstAnswer) {
        this.firstAnswer = firstAnswer;
    }

    public String getSecondAnswer() {
        return secondAnswer;
    }

    public void setSecondAnswer(String secondAnswer) {
        this.secondAnswer = secondAnswer;
    }

    public String getThirdAnswer() {
        return thirdAnswer;
    }

    public void setThirdAnswer(String thirdAnswer) {
        this.thirdAnswer = thirdAnswer;
    }

    public String getFourthAnswer() {
        return fourthAnswer;
    }

    public void setFourthAnswer(String fourthAnswer) {
        this.fourthAnswer = fourthAnswer;
    }

    public Question(int CORRECT_NUMBER_INDEX, String question, String firstAnswer, String secondAnswer, String thirdAnswer, String fourthAnswer) {
        this.CORRECT_NUMBER_INDEX = CORRECT_NUMBER_INDEX;
        this.fourthAnswer = fourthAnswer;
        this.thirdAnswer = thirdAnswer;
        this.secondAnswer = secondAnswer;
        this.firstAnswer = firstAnswer;
        this.question = question;
    }

    public Question(int CORRECT_NUMBER_INDEX) {
        this.CORRECT_NUMBER_INDEX = CORRECT_NUMBER_INDEX;
    }
}
