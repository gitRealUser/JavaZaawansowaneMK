package dzien2_Warsztat;

import java.util.Random;

public class GarageDemo {

    public static void main(String[] args) {

        Wheel[] wheels = new Wheel[4];
        wheels[0] = new Wheel();
        wheels[1] = new Wheel();
        wheels[2] = new Wheel();
        wheels[3] = new Wheel();

        Car car1 = new Car(wheels);
        car1.crash();
        car1.crash();
        System.out.println(car1);
        System.out.println("---1--");
        Garage garage1 = new Garage(car1);
        System.out.println(garage1.whellFixing());
        System.out.println("---2--");
        System.out.println(car1);







    }
}
