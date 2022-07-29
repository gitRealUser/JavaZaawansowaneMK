package powtorka.dziedziczenie_abs_poli.kingdom;

import java.util.ArrayList;
import java.util.List;

public class Town {



    public static void main(String[] args) {
        List<Cityzen> cityzens = new ArrayList<>();

        Cityzen cityzen1 = new King("Marcin");
        Cityzen cityzen2 = new Peasant("Janusz");
        Cityzen cityzen3 = new Peasant("Wojtek");
        Cityzen cityzen4 = new Peasant("Michal");
        Cityzen cityzen5 = new Soldier("Inx");
        Cityzen cityzen6 = new Soldier("Yo");
        Cityzen cityzen7 = new Townsman("Henryk");
        Cityzen cityzen8 = new Townsman("Ruby");
        cityzens.add(cityzen1);
        cityzens.add(cityzen2);
        cityzens.add(cityzen3);
        cityzens.add(cityzen4);
        cityzens.add(cityzen5);
        cityzens.add(cityzen6);
        cityzens.add(cityzen7);
        cityzens.add(cityzen8);

        Town town1 = new Town();
        town1.howManyCanVote(cityzens);
        town1.whoCanVote(cityzens);



    }

    public void howManyCanVote (List<Cityzen> cityzens) {
        int counter = 0;
        for (Cityzen cityzen : cityzens) {
            if (cityzen.canVote()) {
                counter++;
            }
        }
        System.out.println(counter + " persons can vote");

    }

    public void whoCanVote(List<Cityzen> cityzens){
        for(Cityzen cityzen: cityzens){
            if(cityzen.canVote()) {
                System.out.println(cityzen.getName());
            }
        }
    }

}
