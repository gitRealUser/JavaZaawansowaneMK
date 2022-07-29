package dzien4_Inheritance;

import java.util.ArrayList;

public class AnimalDemo {

    public static void main(String[] args) {


        Monkey monkey = new Monkey();
        Monkey monkey2 = new Monkey("Filutek", 4, 15);


        Whale whale = new Whale();
        Whale whale2 = new Whale("Radek", 45, 7);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(monkey);
        animals.add(monkey2);
        animals.add(whale);
        animals.add(whale2);



//        for(Animal animal: animals){
//            animal.eat();
//            System.out.println("---");
//        }

//        AnimaGuide animaGuide = new AnimaGuide();
//        animaGuide.feedMonkey(monkey);

        monkey.makeSound();




    }
}