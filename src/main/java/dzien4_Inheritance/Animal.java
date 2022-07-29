package dzien4_Inheritance;

public class Animal {

    private int age;

    private String name;

    public Animal(int age, String name) {
        System.out.println("animal constructor");
        this.age = age;
        this.name = name;
    }

    public void eat(){
        System.out.println("Animal eats food");

    }

    public void makeSound(){
        System.out.println("sound!!! Animal class");
    }


}
