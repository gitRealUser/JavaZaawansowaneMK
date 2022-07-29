package dzien8_collections.dzien9_set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();

        set1.add("Pizza");
        set1.add("Mango");
        set1.add("Chicken");
        set1.add("Potatoes");
        set1.add("Steak");
        set1.add("Steak");

        for (String meal: set1) {
            System.out.println(meal.toUpperCase());
        }

        System.out.println("............");




    }


/*    12. Wykonaj następujące polecenia:
            ● Stwórz zbiór nazw potraw i uzupełnij 5 potrawami.
● Spróbuj dodać potrawę która znajduje się już w zbiorze
● Spróbuj wyświetlić pierwszą potrawę w zbiorze - da się?
            ● Przeiteruj się po wszystkich elementach zbioru wyświetlając potrawy dużymi
            literami*/
}
