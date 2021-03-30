package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards = new ArrayList<>();

    int cardNum = 0;

    public void createDeck(){
        for (int i = 0; i < 4; i++){
            for (int j = 2; j < 11; j++) {
                cards[cardNum] = new Card(j, i, 4);
                cardNum++;
            }
            for (int k = 0; k < 3; k++) {
                cards[cardNum] = new Card(10, i, k);
                cardNum++;
            }
            cards[cardNum] = new Card(1, i, 3);
            cardNum++;
        }
    }

    public double randomNumGen(){
        return Math.floor(Math.random()*52);
    }

    public void deal(Player player) {
        double drawnCardVal = randomNumGen();
        if (usedCards.size() < 52) {
            while (usedCards.contains((int) drawnCardVal)) {
                drawnCardVal = randomNumGen();
            }
            usedCards.add((int) drawnCardVal);
            player.addCard(cards[(int) drawnCardVal]);
        } else {
            System.out.println("No cards left in deck");
        }
    }

    public void showDeck() {

        for (int i = 0; i < 52 ; i++){
            int k = 1 + i;
            if (cards[i].faceVal == 4){
                System.out.println("Card " + k + " is: " + cards[i].cardValue + "" + cards[i].suit[cards[i].suitValue]);
            }
            if (cards[i].faceVal != 4){
                System.out.println("Card " + k + " is: " + cards[i].faces[cards[i].faceVal] + "" + cards[i].suit[cards[i].suitValue]);
            }
        }
    }

    public void sortUsed(){
        Collections.sort(usedCards);
    }
}
