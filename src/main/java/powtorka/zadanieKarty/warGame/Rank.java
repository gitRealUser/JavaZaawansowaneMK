package powtorka.zadanieKarty.warGame;

public enum Rank {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(15),
    QUEEN(20),
    KING(25),
    AS(30),
    YOKER(40);


    private int strenght;

    Rank(int strenght) {
        this.strenght = strenght;
    }

    public int getStrenght() {
        return strenght;
    }
}
