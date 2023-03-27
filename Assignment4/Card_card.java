package java_assignments_package;

import java.util.*;
public class Card_card {
    Scanner sc = new Scanner(System.in);
    private String suit;
    private String value;

    public String getSuit(){
        return suit;
    }

    public void setSuit(String suit){
        this.suit= suit;
    }

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value= value;
    }

    public  Card_card(String suit, String value){
        this.suit= suit;
        this.value= value;
    }

    public String tostring(){
        return "\n value of card is"+ value + "suit is"+ suit+".";
    }

}
