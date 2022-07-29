package powtorka.zadanieKarty.warGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WarGameDemo {
    public static void main(String[] args) {

        Player[] players = new Player[2];
        players[0] = new Player("Janek");
        players[1] = new Player("Marynka");

        WarGame warGame1 = new WarGame(players);
        warGame1.play();

//        for (Card card: players[0].getPlayerCardSet()){
//            System.out.println(card);
//        }
//        System.out.println(".........");
//
//        for (Card card: players[1].getPlayerCardSet()){
//            System.out.println(card);
//        }



    }

}
