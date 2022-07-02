package dzien2_DOM;

import java.util.Arrays;

public class Pokoj {

    private Lozko lozko1;
    private Okno[] okna;

    public Pokoj(Lozko lozko1, Okno[] okna) {
        this.lozko1 = lozko1;
        this.okna = okna;
    }

    public Pokoj() {
    }

    void roomCleaner(){
        lozko1.setDayCounter(0);
        for(Okno okno : okna){
            okno.windowSwitch(true);
        }
    }


    @Override
    public String toString() {
        return "Pokoj{" +
                "lozko1=" + lozko1 +
                ", okna=" + Arrays.toString(okna) +
                '}';
    }
}
