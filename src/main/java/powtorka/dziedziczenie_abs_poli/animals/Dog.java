package powtorka.dziedziczenie_abs_poli.animals;

public class Dog extends Animal{

    public Dog(String color, int age) {
        super(color, age);
        System.out.println("Dog not default constructor");
    }

    void eatBone(){
        System.out.println("Dog is eating bone");
    }

    @Override
    void makeSound() {
        System.out.println("hau hau");;
    }

    @Override
    void run() {
        System.out.println("Dog is running");

    }
}
