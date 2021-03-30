package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class Player {
    String name;
    Hand hand = new Hand();
    int potValue;

    Player(String name, int potValue){
        this.name = name;
        this.potValue = potValue;
    }

    boolean compDecision;

    public void addCard(Card x){
        hand.cardList.add(x);
    }

    public void computerAI(Player player) {
        if (player.hand.handValue < 16){
            compDecision = true;
        } else {
            compDecision = false;
        }
    }


    Scanner scanner = new Scanner(System.in);

    public void setComputerPlayer(){
        name = "Computer";
    }

    public void setHumanPlayer(){
        System.out.println("Input player name: ");
        String human = scanner.nextLine();
        name = human;
    }
}
