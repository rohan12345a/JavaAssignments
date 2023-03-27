package java_assignments_package;

import java.util.Scanner;

public class Cards_main01 {

    public static void main(String[] args) {
        card_DEck deck= new card_DEck();
        Scanner sc= new Scanner(System.in);


        int k=1;
        while(k==1){
            System.out.println("Enter your choice you want to perform 1) Create\n 2) Display_Deck\n 3)Suffle_Deck\n 4)Compare_Deck\n 5)Compare_Cards\n 6)Sort_Card\n 7) Find_card\n 8) Deal_Card\n 9) Same_card\n ");
            int ch= sc.nextInt();

            switch (ch){
                case 1:
                    deck.createDeck();
                    break;
                case 2:
                    deck.showCards();
                    break;
                case 3:
                    deck.shuffleD();
                    System.out.println("The cards after shuffle");
                    deck.showCards();
                    break;
                case 4:
                    System.out.println("The top card value is"+ deck.topCard());
                    break;

                case 5:
                    Card_card c= deck.createCard();
                    Card_card v= deck.createCard();
                    deck.CompareCard(c,v);
                    break;
                case 6:
                    deck.sortCard();
                    break;

                case 7:
                    System.out.println("Enter value of card u want to search\n");
                    sc.nextLine();
                    String valsearch= sc.nextLine();

                    System.out.println("Enter the suit u want to serch");
                    String suitsearch= sc.nextLine();
                    deck.findcard(valsearch, suitsearch);
                    break;

                case 8:
                    System.out.println(deck.deal());
                    break;
                case 9:
                    Card_card d= deck.createCard();
                    deck.samecard(d);
                    break;
            }
            System.out.println("\n Press 1 to continue \n");
            k= sc.nextInt();
        }
    }
}
