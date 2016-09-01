package nyc.c4q.wesniemarcelin;

public class Main {

    public static void main(String[] args) {
	// write your code here
//    PlayingCard playingCard = new PlayingCard(PlayingCard.Suit.CLUB, 1);
//        playingCard.suit = PlayingCard.Suit.CLUB;
//        System.out.println(playingCard.getValue());
//        System.out.println(playingCard.getSuit);
//        CardDeck deck = new CardDeck();
//        CardDeck deck = null;
//        do{
//
//        }
//        while(deck == null);
//        System.out.println(deck);
//        Vehicle vehicle = new Bicycle(0.0);
//        vehicle = new AstonMartin();
//        vehicle.applyBrakes();
        Bicycle bicycle = new Bicycle(10);
        System.out.println(bicycle.slowDown(5));
        System.out.println(bicycle.speedUp(15));
        System.out.println(bicycle.applyBrakes());

    }


}
