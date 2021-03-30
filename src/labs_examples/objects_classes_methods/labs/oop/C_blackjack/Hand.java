package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cardList = new ArrayList<>();
    int handValue;

    public void showHandList(){
        cardList.forEach((x) -> System.out.println("Card worth: " + x.cardValue + " of suit: " + x.suit[x.suitValue] + " and face type: " + x.faces[x.faceVal]));
    }

    public void addHand(){
        handValue = 0;
        for (Card card : cardList) {
            if (handValue < 11 && card.faceVal == 3){
                handValue += card.cardValue + 10;
            } else {
                handValue += card.cardValue;
            }
        }
    }

    public boolean is21(){
        if (handValue > 21) {
            return true;
        } else {
            return false;
        }
    }
    public boolean is16(){
        if (handValue > 16) {
            return true;
        } else {
            return false;
        }
    }
}
