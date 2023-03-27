package java_assignments_package;

import java.util.*;
import java.lang.Math;
public class card_DEck {
    Scanner sc= new Scanner(System.in);
    String[] suit= {"Club", "Spade","Diamond", "Heart"};
    String[] value= {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    ArrayList<Card_card> card= new ArrayList<Card_card>();
    public void createDeck() {
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                this.card.add(new Card_card(suit[j], value[i]));
            }
        }

    }

    public void shuffleD(){
        Collections.shuffle(this.card);
    }

    public void  showCards(){
        System.out.println(this.card);
    }
    public Object topCard(){
        return card.get(0);
    }

    public Card_card createCard(){
        System.out.println("Enter suit of card \n");
        String suit= sc.nextLine();
        System.out.println("Enter value of card \n");
        String value = sc.nextLine();
        return new Card_card(suit, value);
    }

    public void CompareCard(Card_card c, Card_card v){
        ArrayList <String> suitorder=new ArrayList<String>(Arrays.asList(suit));
        ArrayList <String> valueorder= new ArrayList<String>(Arrays.asList(value));
        int csuitorder=suitorder.indexOf(c.getSuit());
        int cvalorder=valueorder.indexOf(c.getValue());
        int vsuitorder=suitorder.indexOf(v.getSuit());
        int vvalueorder=valueorder.indexOf(v.getValue());



        if (c.getSuit()==v.getSuit() && c.getValue()==v.getValue())
        {
            System.out.println("The cards are  similar ");
        }
        else  if (cvalorder>vvalueorder || (cvalorder==vvalueorder && csuitorder>vsuitorder))

        {
            System.out.println("The  first card  is  higher");

        }
        else if (cvalorder<vvalueorder || (cvalorder==vvalueorder && csuitorder<vsuitorder))
        {
            System.out.println("The second card is higher");
        }
    }

    public void sortCard(){
        ArrayList<String> deckcrd= new ArrayList<String>();
        for( Card_card crd: card){
            deckcrd.add(crd.getValue() + crd.getSuit());
        }
        Collections.sort(deckcrd);
        System.out.println(deckcrd);

    }

    public void findcard(String val, String suit){
        int flag=0;
        for(Card_card crd:this.card){
            if((crd.getSuit().equals(suit)) && (crd.getValue().equals(val))){
                System.out.println("Card Found at "+this.card.indexOf(crd)+" of the deck");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Card not found");
        }
    }

    public void samecard(Card_card c){
        String c_val=c.getValue();
        String c_suit=c.getSuit();
        System.out.println("Cards that are sim to other cards are: ");
        for(Card_card crd: this.card){
            if(crd.getSuit().equals(c_suit)&& !(crd.getValue().equals(c_val))){
                System.out.println(crd);
            }
        }
    }

    public ArrayList<Card_card> deal(){
        // This is the loop to print random cards
        ArrayList<Card_card> dealcards= new ArrayList<Card_card>();
        for(int i=0;i<5; i++){
            int index = (int)(Math.random() * card.size());
            dealcards.add(card.get(index));

        }
        return dealcards;
    }


}
