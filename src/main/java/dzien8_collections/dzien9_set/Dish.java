package dzien8_collections.dzien9_set;

import java.util.Objects;

public class Dish {

    private String name;
    private int price;
    private int energy;
    private Typ typ;




    public Dish(String name, int price, int energy, Typ typ) {
        this.name = name;
        this.price = price;
        this.energy = energy;
        this.typ = typ;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", energy=" + energy +
                ", typ=" + typ +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return price == dish.price && energy == dish.energy && Objects.equals(name, dish.name) && typ == dish.typ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, energy, typ);
    }
}

/*



        ● zaimplementuj metody equals i hashCode aby uniknąć duplikatów i upewnij
        się, że spełniają swoje zadanie
        ● stwórz metodę pozwalającą wyszukać danie po nazwie, ma ona zwracać
        obiekt typu Dish, w przypadku nie odnalezienia takiego obiektu obiektu ma
        rzucać wyjątek typu RestaurantException
        ● stwórz metodę pozwalającą wyszukać dania po typie potrawy, jeśli nie ma
        żadnej potrawy w danym typie, metoda ma zwracać pustą listę.*/
