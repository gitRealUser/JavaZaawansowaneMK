package dzien4_Inheritance;

public class Monkey extends Animal {

    private int tailLenght;


    public Monkey(String name, int age,  int tailLenght) {
        super(age, name);
        this.tailLenght = tailLenght;
    }

    public Monkey() {
        super(8, "Jacek");
        tailLenght = 20;
    }

    public void uhaha(){
        System.out.println("Uhahaha!");
    }

    public void jump(){
        System.out.println("jump!!!");
    }

    public void eat(){
        System.out.println("Monkey is eating banana");
    }

    public void makeSound(){

        System.out.println("Sound !!! Monkey class");
    }



}
