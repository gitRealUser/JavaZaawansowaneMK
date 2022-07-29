package dzien4_Inheritance;

public class Whale extends Animal {
    private String name;
    private int age;
    private double weight;

    public Whale(String name, int age, double weight) {
        super(99,"gfgfg");
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Whale() {
        super(88,"gfgfgfg");
        name = "Kraken";
        age = 60;
        weight = 4.5;
    }

public void swim(){
    System.out.println("Whale is swimming");
}

public void swimDeeper(){
    System.out.println("Whale is swimming deeper");
}

public void eat(){
        super.eat();
    System.out.println("Whale is eating small fishes");
}

    public void makeSound(){
        System.out.println("Sound !!! Whale class");
    }


    @Override
    public String toString() {
        return "Whale{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
