package powtorka.dziedziczenie_abs_poli.kingdom;

public class Peasant extends Cityzen{
    public Peasant(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return false;
    }
}
