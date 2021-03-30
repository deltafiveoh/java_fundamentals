package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    int cardValue;
    int suitValue;
    int faceVal;
    String[] faces = new String[] {"King", "Queen", "Jack", "Ace", "Number"};

    Card(int num, int suitVal, int typeVal){
        this.cardValue = num;
        this.suitValue = suitVal;
        this.faceVal = typeVal;
    }

}
