package dzien8_collections.dzien9_set;

import java.util.HashSet;
import java.util.Set;

public class Restaurant {

    private Set<Dish> dishSet = new HashSet<>();

   public void addDish  (Dish dish){
       dishSet.add(dish);
   }

   public void removeDish(Dish dish){
       dishSet.remove(dish);
   }

    public Set<Dish> getDishSet() {
        return dishSet;
    }
}
