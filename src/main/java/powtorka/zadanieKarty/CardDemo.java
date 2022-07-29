package powtorka.zadanieKarty;

import java.util.ArrayList;
import java.util.List;

public class CardDemo {


    public static void main(String[] args) {
        Card card1 = new Card(Rank.AS, Suit.PIK);
        Card card2 = new Card(Rank.TEN, Suit.KIER);

        System.out.println(card1);
        CardDemo cardDemo = new CardDemo();
        cardDemo.checkCard(card1, card2);
        System.out.println("..........");



/*        List<Card> cardListPik = new ArrayList<Card>();

        for(Rank rank: Rank.values()){
            if(Rank.JOKER.equals(rank)){
                continue;
            }
            else{
                cardListPik.add(new Card(rank,Suit.PIK));
            }
        }

        for(Card card: cardListPik){
            System.out.println(card);
        }*/

        System.out.println("..............");

        List<Card> cardsSet = new ArrayList<>();
        int numberOfYokers = 2;
        for(Rank rank: Rank.values()){
            for(Suit suit : Suit.values()) {
                if (Rank.JOKER.equals(rank) && numberOfYokers > 0) {
                    cardsSet.add(new Card(rank));
                    numberOfYokers--;
                } else {
                    cardsSet.add(new Card(rank, suit));
                }
            }
        }

        for(Card card: cardsSet){
            System.out.println(card);
        }





    }



    public void checkCard(Card card1, Card card2){
        if(card1.getStreght() == card2.getStreght()){
            System.out.println("Cards are equal");
        }
        else if (card1.getStreght() > card2.getStreght()){
            System.out.println(card1 + " is stronger than " + card2);
        }
        else{
            System.out.println(card2 + " is stronger than " + card1);
        }
    }
}
