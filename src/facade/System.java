package facade;

import domain.Question;

public class System {
    Question q;
    public System(String question, int correctAnswer, String... answers){
        q = new Question(question, correctAnswer, answers);
    }
    
    public String getQuestion(int questionID){
        return q.getQuestion();
    }

    public String getCorrectAnswer(int questionID){
        return q.getCorrectAnswer(questionID);
    }
}
