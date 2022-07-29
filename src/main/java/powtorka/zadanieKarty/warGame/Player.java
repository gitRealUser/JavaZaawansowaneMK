package powtorka.zadanieKarty.warGame;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Card> playerCardSet;

    public Player(String name) {
        this.name = name;
        this.playerCardSet = new ArrayList<>();
    }

    void takeCard(Card card){
        playerCardSet.add(card);
    }

    public List<Card> getPlayerCardSet() {
        return playerCardSet;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", playerCardSet=" + playerCardSet +
                '}';
    }
}
