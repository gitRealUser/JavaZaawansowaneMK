package powtorka.zadanieKarty;

public class Card {

    private Rank rank;
    private Suit suit;



    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Card(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

int getStreght(){
        return rank.getStrenght();
}


    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit=" + suit +
                ", strenght=" + getStreght() +
                '}';
    }
}
