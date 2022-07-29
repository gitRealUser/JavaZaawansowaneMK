package powtorka.zadanieKarty.warGame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class WarGame {

    private  Player[] players;

    public WarGame(Player[] players) {
        this.players = players;
    }




    public void play(){
        List<Card> cardList = new ArrayList<>();
        cardList = createSet();
        List<Card> warCardSet = new ArrayList<>();
        Collections.shuffle(cardList);
        for(int i = 0; i < cardList.size(); i++){
            players[0].takeCard(cardList.remove(i));
            players[1].takeCard(cardList.remove(i));
        }


        while(!players[0].getPlayerCardSet().isEmpty() || !players[1].getPlayerCardSet().isEmpty()){
            if(players[0].getPlayerCardSet().get(0).getStrenght() > players[1].getPlayerCardSet().get(0).getStrenght()){
                players[0].takeCard(players[1].getPlayerCardSet().get(0));
                players[1].getPlayerCardSet().remove(0);
                System.out.println("Player 0 win round");
            }
            else if (players[0].getPlayerCardSet().get(0).getStrenght() < players[1].getPlayerCardSet().get(0).getStrenght()){
                players[1].takeCard(players[0].getPlayerCardSet().get(0));
                players[0].getPlayerCardSet().remove(0);
                System.out.println("Player 1 win round");
            }
            else{
              for(int i = 0; i >= 0; i+=2){
                  if(players[0].getPlayerCardSet().get(i).getStrenght() == players[1].getPlayerCardSet().get(i).getStrenght()){
                      warCardSet.add(players[0].getPlayerCardSet().remove(i));
                      warCardSet.add(players[1].getPlayerCardSet().remove(i));
                  }
                  if(!players[0].getPlayerCardSet().isEmpty() || !players[1].getPlayerCardSet().isEmpty()){
                      warCardSet.add(players[0].getPlayerCardSet().remove(i+1));
                      warCardSet.add(players[1].getPlayerCardSet().remove(i+1));
                  }


              }
            }
        }


        


        }



    public List<Card> createSet(){
        List<Card> cardList = new ArrayList<>();

        int numberOfYokers = 2;
        for(Rank rank: Rank.values()){
            for(Suit suit: Suit.values()){
                if(numberOfYokers > 0 && rank == Rank.YOKER){
                    cardList.add(new Card(rank));
                    numberOfYokers--;
                }
                else if(numberOfYokers == 0 && rank == Rank.YOKER){
                    continue;
                }
                else {
                    cardList.add(new Card(rank,suit));
                }

            }
        }

        return cardList;
    }


}
