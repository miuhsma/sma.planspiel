package ui;

import java.util.Scanner;

public class UI {

    private int textSpeed = 100;
    public UI(){

        printQuestion("BLALBALBSDÖFSDF(NEW/PRHWSEZERF(SDF");
        // printMainMenu();
    }

    private void printMainMenu(){
        System.out.println("Willkommen beim SMA-Planspiel!\nBitte treffen Sie Ihre Auswahl:");
        System.out.println("(1) Neues Spiel");   
        System.out.println("(2) Frage hinzufügen");   
        System.out.println("(9) Textgeschwindigkeit setzen");
        System.out.println("(0) Beenden");   
        System.out.print("Ihre Auswahl: ");
        Scanner sc = new Scanner(System.in);
        Integer choose = sc.nextInt();
        

        sc.close();
    }

    private void printQuestion(String question){
        for (int i = 0; i<question.length(); i++){
            System.out.print(question.charAt(i));
            try {
                Thread.sleep(this.textSpeed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
