package facade;

import static org.junit.Assert.*;
import org.junit.Test;

public class SystemTest {
  
    @Test
    public void createBasicQuestionsWith3Answers(){
        String setQ = "Hauptstadt von Deutschland?";
        String A1 = "Hamburg";
        String A2 = "Berlin";
        String A3 = "München";
        System game = new System(setQ, 2, A1, A2, A3);
        String Q = game.getQuestion(0);
        assertEquals(setQ, Q);
    }
}