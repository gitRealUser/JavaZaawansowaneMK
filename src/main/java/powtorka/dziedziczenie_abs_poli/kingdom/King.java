package powtorka.dziedziczenie_abs_poli.kingdom;

public class King extends Cityzen{


    public King(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return false;
    }
}
