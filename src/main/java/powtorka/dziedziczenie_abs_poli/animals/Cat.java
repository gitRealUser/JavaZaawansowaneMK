package powtorka.dziedziczenie_abs_poli.animals;

public class Cat extends Animal{

Cat(String color, int age){
    super(color, age);
    System.out.println("Cat not default constructor");
}



public void eatMouse(){
    System.out.println("Cat is eating mouse");
}

    @Override
    void makeSound() {
        System.out.println("miaw");
    }

    @Override
    void run() {
        System.out.println("Cat is running");
    }
}
