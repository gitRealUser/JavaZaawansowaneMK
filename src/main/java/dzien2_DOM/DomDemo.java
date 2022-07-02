package dzien2_DOM;

public class DomDemo {

    public static void main(String[] args) {

        Okno[] okna = new Okno[4];
        okna[0] = new Okno(false);
        okna[1] = new Okno(false);
        okna[2] = new Okno(false);
        okna[3] = new Okno(false);


        Lozko lozko1 = new Lozko(5);

        Pokoj[] pokoje = new Pokoj[2];
        pokoje[0] = new Pokoj();
        pokoje[1] = new Pokoj(lozko1, okna);





        Dom dom1 = new Dom(pokoje);
        System.out.println(dom1);


    }

}
