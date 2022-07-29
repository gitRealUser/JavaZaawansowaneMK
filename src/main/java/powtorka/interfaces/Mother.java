package powtorka.interfaces;

public class Mother implements FamilyMember{

    private String name;

    public Mother(String name) {
        this.name = name;

    }

    @Override
    public void introduceYourself() {
        System.out.println("I'm mother");
        System.out.println("My name is " + this.name);
    }

    @Override
    public boolean isAdult() {
        return true;
    }




}
