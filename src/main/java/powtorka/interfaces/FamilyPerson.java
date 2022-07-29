package powtorka.interfaces;

public abstract class FamilyPerson {

    private String name;

    public FamilyPerson(String name) {
        this.name = name;
    }

    public void introduceYourself() {
        System.out.println("Hello I'm Family person constructor");
    }

    public boolean isAdult() {
        return true;
    }
}
