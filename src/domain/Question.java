package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question {
    private static int questionCounter = 0;
    private String question;
    private List<String> answerList;
    private int correctAnswerIndex;
    private int questionID;

    public Question(String question, int correctAnswer, String... answers){
        setQuestion(question);
        setAnswer(answers, correctAnswer);
        this.setQuestionID();
    }
    
    private void setQuestionID() {
        this.questionID = questionCounter++;
    }

    private void setQuestion(String question){
        this.question = question;
    }

    private void setAnswer(String[] answers, int correctAnswer){
        if (correctAnswer < 1 || correctAnswer > answers.length)
            throw new IllegalAnswerNoException();
        this.correctAnswerIndex = correctAnswer -1;

        answerList = Arrays.stream(answers).collect(Collectors.toCollection(ArrayList::new));
    }

    public String getQuestion(){
        return this.question;
    }

    public String getCorrectAnswer(int questionID) {
        return answerList.get(questionID);
    }
}
