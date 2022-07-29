package powtorka.zadanieKarty.warGame;

public class Card {

    private Rank rank;

    private Suit suit;

    public Card(){

    }

    public Card(Rank rank) {
        this.rank = rank;
    }

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }


    public int getStrenght(){
        return rank.getStrenght();
    }


    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }
}
