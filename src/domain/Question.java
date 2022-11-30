package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Question {
    private String question;
    private List<String> answerList;
    private int correctAnswerIndex;

    public Question(String question, int correctAnswer, String... answers){
        setQuestion(question);
        setAnswer(answers, correctAnswer);
    }

    public boolean isAnswerCorrect(int answerIndex){
        return (this.correctAnswerIndex == answerIndex);
    }
    
    public String getQuestion(){
        return this.question;
    }

    public String getAnswerOptions(){
        String ret = ""; 
        for (int i = 0; i < answerList.size(); i++)
            ret += "\n(" + (i + 1) + ") " + answerList.get(i);
        
        // Schaff ich nicht...
        // String a = answerList.stream().map(an -> an + " Hallo").toString();
        return ret;
    }

    // Only for testing purposes!
    public String getAnswer(int answerID){
        if (answerID < 0 || answerID > answerList.size())
            throw new IllegalAnswerNoException();
        else
            return answerList.get(answerID);
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
}