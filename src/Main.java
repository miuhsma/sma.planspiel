import ui.UI;
import facade.Game;

public class Main {

    public static void main(String[] args){
        Game game = new Game();

        // Fragen über keine Ahnung wie einlesen. XML? CSV?

        game.addQuestion("Hauptstadt von Deutschland?", 1, "Berlin", "Hamburg", "München");
        game.addQuestion("Wann war der Mauerfall?", 2, "1990", "1989", "1980", "1981");
        game.addQuestion("Wie viele Bundesstaaten hat die USA? ", 4, "1", "49", "51", "52");
        game.addQuestion("Wie heißt der/die Hochschuldekan/Hochschuldekanin für die Fakultät I?", 1, "Prof. Dr. Miriam Föller-Nord", "Prof. Dr. Frank Dopatka", "Angela Merkel");
        game.addQuestion("Wie heißt Mannheims schönste Sehenswürdigkeit?", 3, "Mannheim gibt es gar nicht", "Wasserturm", "Heidelberg");
        game.addQuestion("In welcher Programmiersprache wurde dieses Programm geschrieben?", 2, "JavaScript", "Java", "C++");
        
        
        UI ui = new UI(game);
    }
}