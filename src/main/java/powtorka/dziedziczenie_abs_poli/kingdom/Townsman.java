package powtorka.dziedziczenie_abs_poli.kingdom;

public class Townsman extends Cityzen{


    public Townsman(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return true;
    }
}
