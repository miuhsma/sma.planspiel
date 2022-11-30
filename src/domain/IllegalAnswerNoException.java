package domain;

public class IllegalAnswerNoException extends RuntimeException {
    public IllegalAnswerNoException(){
        super("Ungültige Antwortnummer!");
    }
}
