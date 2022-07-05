package dzien4_Inheritance;

public class Monkey extends Animal {
    private int age;
    private String name;
    private int tailLenght;

    public Monkey(String name, int age,  int tailLenght) {
        this.age = age;
        this.name = name;
        this.tailLenght = tailLenght;
    }

    public Monkey() {
        name = "Jacek";
        age = 8;
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


    @Override
    public String toString() {
        return "Monkey{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", tailLenght=" + tailLenght +
                '}';
    }
}
