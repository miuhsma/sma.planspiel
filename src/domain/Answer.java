package domain;

public class Answer {
    private final String answer;
    private final boolean correct;

    public Answer(String answer, boolean correct) {
        this.answer = answer;
        this.correct = correct;
    }

    public String getAnswer() {
        return this.answer;
    }

    public boolean getCorrect() {
        return this.correct;
    }
}
