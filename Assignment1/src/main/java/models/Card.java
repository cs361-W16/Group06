package models;


public class Card {
    private String rank;
    private String suit;

    public Card(String r, String s){
        this.rank = r;
        this.suit = s;
    }


    public String getRank(){
        return this.rank;
    }

    public String getSuit(){
        return this.suit;
    }

}