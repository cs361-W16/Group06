package models;

/**
 * Created by Wenbo on 1/21/2016.
 */
public class Table {
    private int count_1=12;
    private int count_2=12;
    private int count_3=12;
    private int count_4=12;
    Card[] Column_1=new Card[13];
    Card[] Column_2=new Card[13];
    Card[] Column_3=new Card[13];
    Card[] Column_4=new Card[13];
    public Table (){
        for (int i=0;i<13;i++){
            Column_1[i]=new Card(" "," ");
            Column_2[i]=new Card(" "," ");
            Column_3[i]=new Card(" "," ");
            Column_4[i]=new Card(" "," ");
        }
    }

    public Card Reurn_Column_1 ( ){
        if (count_1 >= 0){
            Card card1 = Column_1[count_1];
            count_1--;
            return card1;
        }
        else {
            return null;
        }
    }
    public Card Reurn_Column_2 ( ){
        if (count_2 >= 0){
            Card card1=Column_2[count_2];
            count_2--;
            return card1;
        }
        else {
            return null;
        }
    }
    public Card Reurn_Column_3 ( ){
        if (count_3 >= 0){
            Card card1=Column_3[count_3];
            count_3--;
            return card1;
        }
        else {
            return null;
        }
    }
    public Card Reurn_Column_4 ( ){
        if (count_4 >= 0){
            Card card1=Column_4[count_4];
            count_4--;
            return card1;
        }
        else {
            return null;
        }
    }
}
