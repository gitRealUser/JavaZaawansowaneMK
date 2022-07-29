package powtorka.dziedziczenie_abs_poli.animals;

import java.util.ArrayList;
import java.util.List;

public class AnimalDemo {

    public static void main(String[] args) {

        Animal dog1 = new Dog("black",5);
        Animal cat1 = new Cat("white", 3);
        System.out.println("...");
        cat1.goSleep();
        cat1.makeSound();
        dog1.goSleep();
        dog1.makeSound();
        System.out.println(".....");
        ((Dog) dog1).eatBone();
        System.out.println(".....");


        List<Animal> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(cat1);

        for(Animal animal: animals){
            animal.makeSound();
            System.out.println("___");
        }

        for(Animal animal: animals){
            animal.run();
            System.out.println("___");
        }



    }
}
