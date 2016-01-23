package models;


import java.io.Serializable;

public class Card implements Serializable{
    public String rank;

  /*   public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setRank(String rank) {
        this.rank = rank;
    } */

    public String suit;
    public String r_s;
    public Card(String r, String s){
        this.rank = r;
        this.suit = s;
        this.r_s=r+s;
    }

    public Card (){
    }
    public String getRank(){
        return this.rank;
    }

    public String getSuit(){
        return this.suit;
    }

    public String getR_S(){
        return this.r_s;
    }

}