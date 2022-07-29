package powtorka.dziedziczenie_abs_poli.animals;

public abstract class Animal {

    private String color;
    private int age;


    public Animal(){
        System.out.println("Animal default constructor");
    }
    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
        System.out.println("Animal not default constructor");
    }

    void makeSound(){
        System.out.println("Animal sound ...!");
    }

    abstract void run();

    void goSleep(){
        System.out.println("Animal is going sleep");
    }



}
