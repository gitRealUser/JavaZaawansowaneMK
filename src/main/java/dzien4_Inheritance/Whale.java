package dzien4_Inheritance;

public class Whale extends Animal {
    private String name;
    private int age;
    private double weight;

    public Whale(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Whale() {
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


    @Override
    public String toString() {
        return "Whale{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
