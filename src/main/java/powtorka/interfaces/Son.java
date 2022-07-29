package powtorka.interfaces;

public class Son implements FamilyMember{

    private String name;

    public Son(String name) {
        this.name = name;
    }

    @Override
    public void introduceYourself() {
        System.out.println("Who's asking?");
        System.out.println("My name is " + name);
    }

    @Override
    public boolean isAdult() {
        return false;
    }
}
