package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class PlayBlackJack {

    public static void main(String[] args) {
        BlackjackController game = new BlackjackController();

        do {
            game.p1.makeBet();
            game.p2.aiBet();
            System.out.println(game.p1.name + " has a remaining pot of " + game.p1.potValue + " and bet " + game.p1.playerBet);
            System.out.println("The computer has a remaining pot of " + game.p2.potValue + " and bet " + game.p2.playerBet);
            game.playBlackJack();
            System.out.println("The number of games played is " + game.numGamesPlayed);
            System.out.println("The number of games won by the computer is " + game.computerWon);
            System.out.println("The number of games won by " + game.p1.name + " is " + game.playerWon);
            System.out.println(game.p1.name + " has a remaining pot of " + game.p1.potValue);
            System.out.println("The computer has a remaining pot of " + game.p2.potValue);
            game.continuePlaying();
            game.p1.hand.cardList.clear();
            game.p2.hand.cardList.clear();
            game.gameDeck.usedCards.clear();
            System.out.println("");
        } while (game.p1.potValue > 0 && game.p2.potValue > 0 && game.wantsToPlay);

        System.out.println("\n" + game.p1.name + " had a remaining pot of " + game.p1.potValue + " and won " + game.playerWon + " out of " + game.numGamesPlayed + " games");
        System.out.println("");
        System.out.println(game.p2.name + " had a remaining pot of " + game.p2.potValue + " and won " + game.playerWon + " out of " + game.numGamesPlayed + " games");
        System.out.println("\nThank you for playing BlackJack. We hope to see you again soon.");
    }
}
