package nyc.c4q.wesniemarcelin;

/**
 * Created by wesniemarcelin on 8/31/16.
 */
public class CardDeck {
    private PlayingCard[] cards = new PlayingCard[52];
    public CardDeck(){
        int i = 0;
        PlayingCard card;
        for(PlayingCard.Suit suit : PlayingCard.Suit.values()) {
            while (i <= 13) {
                i++;
                //A field is a member variable that belongs to the class
                //Code here from 1 to 13
                card = new PlayingCard(PlayingCard.Suit.CLUB, i);
                //cards[i-1] because the while loop begins at 1 since it increments first
                cards[i - 1] = card;
            }
        }
    }
}
