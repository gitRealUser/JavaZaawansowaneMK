package dzien2_DOM;

public class Okno {

    private boolean open;

    public Okno(boolean open) {
        this.open = open;
    }

    void windowSwitch (boolean open){
        this.open = open;
    }

    @Override
    public String toString() {
        return "Okno{" +
                "open=" + open +
                '}';
    }
}
