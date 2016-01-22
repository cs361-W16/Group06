package models;

import java.util.ArrayList;
import models.Card;


public class Deck {
    Card[] deck = new Card[52];
    private int count = 51;

    String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    String[] suits = {"C", "D", "H", "S"};

    public Deck(){
        for(int i = 0; i < 52; i++){

            deck[i] = new Card( ranks[i % 13], suits[i / 13]);
        }
    }

    // deal cards
    public Card deal(){
        if(count >= 0){
            Card card1 = deck[count];
            count--;

            return card1;
        }else{
            return null;
        }
    }


    public void rand() {
        for(int i=0; i<=51; i++) {
            int r = (int)(Math.random() * (52));
            Card temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
    }
}
