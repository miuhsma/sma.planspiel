package ui;

import java.util.Scanner;
import facade.Game;
public class UI {
    private Game game;
    private Scanner sc = new Scanner(System.in);
    private int textSpeed = 75;
    public UI(Game game){
        this.game = game;
        this.sc = new Scanner(System.in);
        mainMenu();
        play();
    }

    private int mainMenu(){
        System.out.println("Bisher nur (1) implementiert, alle Eingaben führen zu einem neuen Spiel!");
        System.out.println("Willkommen beim SMA-Planspiel!\nBitte treffen Sie Ihre Auswahl:");
        System.out.println("(1) Neues Spiel");   
        //System.out.println("(2) Frage hinzufügen");   
        //System.out.println("(9) Textgeschwindigkeit setzen");
        // System.out.println("(0) Beenden");   
        System.out.print("Ihre Auswahl: ");
        
        return sc.nextInt();
    }
    private void play(){
        int choice = 0;
        do{
            String question = game.getRandomQuestion();
            do {
                print(question);
                choice = sc.nextInt();
                if (game.isAnswerCorrect(choice-1))
                    choice= -1;
                else
                    System.out.println("-------- Leider falsch! --------");
            } while (choice != -1);
            System.out.println("RICHTIG!!!\n\n");
        } while (true);
    }

    private void print(String str){
        for (int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(textSpeed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("\nIhre Antwort: ");
    }
}