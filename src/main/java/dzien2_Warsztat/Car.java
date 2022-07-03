package dzien2_Warsztat;

import java.util.Arrays;
import java.util.Random;

public class Car {

    private Wheel wheels[];

    public Car(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    void crash (){
        Random random = new Random();
        int drawnWheel = random.nextInt(3);
        wheels[drawnWheel].setPierced(true);
        System.out.println(drawnWheel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + Arrays.toString(wheels) +
                '}';
    }
}
