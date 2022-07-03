package dzien2_Warsztat;

public class Wheel {

    private double preasure = 2.5;
    private boolean pierced = false;


    public Wheel(double preasure, boolean pierced) {
        this.preasure = preasure;
        this.pierced = pierced;
    }

    public Wheel() {
    }

    public void setPierced(boolean pierced) {
        this.pierced = pierced;
    }

    public boolean isPierced() {
        return pierced;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "preasure=" + preasure +
                ", pierced=" + pierced +
                '}';
    }
}
