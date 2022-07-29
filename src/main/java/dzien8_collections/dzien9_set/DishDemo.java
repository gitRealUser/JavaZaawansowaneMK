package dzien8_collections.dzien9_set;

public class DishDemo {

    public static void main(String[] args) {

        Dish dish1 = new Dish("Pizza", 45, 600,Typ.DINNER);
        Dish dish2 = new Dish("Pizza2", 45, 600,Typ.DINNER);
        Dish dish3 = new Dish("Pizza3", 45, 600,Typ.DINNER);
        Dish dish4 = new Dish("Pizza4", 45, 600,Typ.DINNER);
        Dish dish5 = new Dish("Pizza", 45, 600,Typ.DINNER);



        Restaurant restaurant1 = new Restaurant();
        restaurant1.addDish(dish1);
        restaurant1.addDish(dish2);
        restaurant1.addDish(dish3);
        restaurant1.addDish(dish4);
        restaurant1.addDish(dish5);
        System.out.println(restaurant1.getDishSet());

    }
}
