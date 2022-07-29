package powtorka.dziedziczenie_abs_poli.kingdom;

public class Soldier extends Cityzen{

    public Soldier(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return true;
    }
}
