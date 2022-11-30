package facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import domain.Question;

public class Game {
    private static final int _BRUTEFORCELIMIT = 1000;
    List<Question> questionList;
    Question currentQuestion;
    
    public Game() {
        questionList = new ArrayList<>();
    }
    
    public void addQuestion(String question, int correctAnswer, String... answers){
        questionList.add(new Question(question, correctAnswer, answers));
    }

    // Only for testing purposes
    public String getRandomQuestion(){
        Random rand = new Random();
        int int_random = rand.nextInt(questionList.size());
        this.currentQuestion = questionList.get(int_random);
        StringBuilder ret = new StringBuilder();
        ret.append(currentQuestion.getQuestion());
        ret.append(currentQuestion.getAnswerOptions());
        return ret.toString();
    }
    
    public boolean isAnswerCorrect(int answerIndex) {
        if (currentQuestion.isAnswerCorrect(answerIndex))
            questionList.remove(currentQuestion);
        else
            return false;
            
        return true;
    }
    // Only for testing purposes
    protected String getQuestion(int questionID){
        return questionList.get(questionID).getQuestion();
    }

    // Only for testing purposes
    protected String getCorrectAnswer(int questionID){
        int answer = bruteForce(questionList.get(questionID));
        return questionList.get(questionID).getAnswer(answer);
    }

    // Only for testing purposes
    private int bruteForce(Question question){
        for (int i = 0; i < _BRUTEFORCELIMIT; i++){
            if (question.isAnswerCorrect(i))
                return i;            
        }
        return -1;
    }

}
