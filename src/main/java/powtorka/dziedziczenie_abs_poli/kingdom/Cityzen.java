package powtorka.dziedziczenie_abs_poli.kingdom;

public abstract class Cityzen {

    private String name;



    public Cityzen(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract boolean canVote();

}
