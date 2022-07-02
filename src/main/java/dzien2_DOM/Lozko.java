package dzien2_DOM;

public class Lozko {
    private int dayCounter;

    public Lozko(int dayCounter) {
        this.dayCounter = dayCounter;
    }

    public void setDayCounter(int dayCounter) {
        this.dayCounter = dayCounter;
    }

    @Override
    public String toString() {
        return "Lozko{" +
                "dayCounter=" + dayCounter +
                '}';
    }
}
