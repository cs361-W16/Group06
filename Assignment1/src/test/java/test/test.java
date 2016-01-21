
import models.Card;
import models.Deck;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class test {
    @Test
    public void testDeck1() {
        Deck deck = new Deck();
        assertNotNull(deck);
    }
    // add more test here


    @Test
    public void testDeck2() {
        Deck deck = new Deck();

        for (int i = 0; i < 52; i++) {
            Card card = deck.deal();
            System.out.print(card.getRank() + " " + card.getSuit() + "\n");
        }
        System.out.print("\n");
    }




    @Test
    public void testrand() {
        Deck deck = new Deck();
        deck.rand();
        for (int i = 0; i < 52; i++) {
            Card card1 = deck.deal();
            System.out.print(card1.getRank() + " " + card1.getSuit() +  "\n");
        }

    }

}