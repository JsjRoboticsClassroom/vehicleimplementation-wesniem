package nyc.c4q.wesniemarcelin;

/**
 * Created by wesniemarcelin on 8/31/16.
 */
public class PlayingCard {
    Suit suit;
    int value;


    public PlayingCard() {
        suit = Suit.CLUB;
        value = 10;

    }

    public Suit getSuit(){
        return suit;
    }

    public int getValue() {
        return this.value;
    }

    public PlayingCard(Suit suit, int value) {
        this.suit = suit;
        value = 10;
    }

    //Enums are used for a limited set of options
    public enum Suit {
        DIAMOND, SPADE, CLUB, HEART
    }
}
