package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.Scanner;

public class BlackjackController {
    public String selectUser() {
        System.out.println("Select user name");
        Scanner user = new Scanner(System.in);
        String userName = user.nextLine();
        return userName;
    }
    boolean wantsToPlay;
    public static int numGamesPlayed = 0;
    public static int computerWon = 0;
    public static int playerWon = 0;
    Deck gameDeck = new Deck();

    String inputName = selectUser();

    Player p1 = new Player(inputName, 500);
    Player p2 = new Player("Computer", 500);

    public void playBlackJack(){
        numGamesPlayed++;
        gameDeck.cards = new Card[52];
        gameDeck.cardNum = 0;
        boolean keepPlayingP1 = true;
        boolean keepPlayingP2 = true;
        boolean p1Busted = false;
        boolean p2Busted = false;

        char playerInput;

        Scanner scanner = new Scanner(System.in);

        gameDeck.createDeck();
        gameDeck.deal(p1);
        gameDeck.deal(p2);
        gameDeck.deal(p1);
        gameDeck.deal(p2);

        handDetails(p1, p2);

        while (keepPlayingP1 || keepPlayingP2){
            if (keepPlayingP1){
                System.out.println("Draw another card? (Y/N)");
                playerInput = scanner.next().charAt(0);
                if (playerInput == 'Y' || playerInput == 'y'){
                    gameDeck.deal(p1);
                }
                if (playerInput == 'N' || playerInput == 'n'){
                    keepPlayingP1 = false;
                }
                if (p1.hand.is21()){
                    keepPlayingP1 = false;
                    System.out.println(p1.name + " busted!");
                    p1Busted = true;
                }
            }
            if (keepPlayingP2){
                if (!p2.hand.is16()){
                    gameDeck.deal(p2);
                }
                if (p2.hand.is16()){
                    keepPlayingP2 = false;
                }
                if (p2.hand.is21()){
                    keepPlayingP2 = false;
                    System.out.println(p2.name + " busted!");
                    p2Busted = true;
                }
            }
            handDetails(p1, p2);
        }

        if (keepPlayingP1 == false && keepPlayingP2 == false){
            if(p1Busted && p2Busted){
                System.out.println("Draw! Both players busted");
                System.out.println(p1.name + " had a final hand value of " + p1.hand.handValue);
                System.out.println(p2.name + " had a final hand value of " + p2.hand.handValue);
                p1.potValue += p1.playerBet;
                p1.playerBet = 0;
                p2.potValue += p2.playerBet;
                p2.playerBet = 0;
            }
            if (p1Busted && !p2Busted){
                System.out.println("The computer player wins");
                System.out.println(p1.name + " had a final hand value of " + p1.hand.handValue);
                System.out.println(p2.name + " had a final hand value of " + p2.hand.handValue);
                p2.potValue += p1.playerBet;
                p1.playerBet = 0;
                p2.potValue += p2.playerBet;
                p2.playerBet = 0;
                computerWon++;
            }
            if (!p1Busted && p2Busted){
                System.out.println(p1.name + " wins");
                System.out.println(p1.name + " had a final hand value of " + p1.hand.handValue);
                System.out.println(p2.name + " had a final hand value of " + p2.hand.handValue);
                p1.potValue += p1.playerBet;
                p1.playerBet = 0;
                p1.potValue += p2.playerBet;
                p2.playerBet = 0;
                playerWon++;
            }
            if (!p1Busted && !p2Busted){
                if (p1.hand.handValue > p2.hand.handValue) {
                    System.out.println(p1.name + " wins");
                    System.out.println(p1.name + " had a final hand value of " + p1.hand.handValue);
                    System.out.println(p2.name + " had a final hand value of " + p2.hand.handValue);
                    p1.potValue += p1.playerBet;
                    p1.playerBet = 0;
                    p1.potValue += p2.playerBet;
                    p2.playerBet = 0;
                    playerWon++;

                }
                if (p2.hand.handValue > p1.hand.handValue) {
                    System.out.println("The computer player wins");
                    System.out.println(p1.name + " had a final hand value of " + p1.hand.handValue);
                    System.out.println(p2.name + " had a final hand value of " + p2.hand.handValue);
                    p2.potValue += p1.playerBet;
                    p1.playerBet = 0;
                    p2.potValue += p2.playerBet;
                    p2.playerBet = 0;
                    computerWon++;
                }
                if (p2.hand.handValue == p1.hand.handValue){
                    System.out.println("Draw! Both players have the same score");
                    System.out.println("Both players have a final hand value of " + p1.hand.handValue);
                    p1.potValue += p1.playerBet;
                    p1.playerBet = 0;
                    p2.potValue += p2.playerBet;
                    p2.playerBet = 0;
                }
            }
        }

    }

    public void handDetails(Player p1, Player p2){
        System.out.println(p1.name + " has hand: ");
        p1.hand.showHandList();
        p1.hand.addHand();
        System.out.println("The total hand value is: " + p1.hand.handValue);

        System.out.println(p2.name + " has hand: ");
        p2.hand.showHandList();
        p2.hand.addHand();
        System.out.println("The total hand value is: " + p2.hand.handValue);
    }

    public void handDetails(Player p1){
        System.out.println(p1.name + " has hand: ");
        p1.hand.showHandList();
        p1.hand.addHand();
        System.out.println("The total hand value is: " + p1.hand.handValue);
    }

    public void continuePlaying(){
        Scanner scanner = new Scanner(System.in);
        char choice;
        System.out.println("Continue playing? Y/N");
        choice = scanner.next().charAt(0);
        if (choice == 'Y' || choice == 'y'){
            wantsToPlay = true;
        }
        if (choice == 'N' || choice == 'n'){
            wantsToPlay = false;
        }
    }

}

/*
        Make the BlackJack game we just created better. Add a way for the user and the computer to bet. Give the user and computer
        both an initial sum of "money" and let them play with it. Take actual bets. If either user runs out of money, stop the game.
        Consistently print out the current amount of money both the user and computer have after each game.
*/