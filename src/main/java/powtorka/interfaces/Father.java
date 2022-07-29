package powtorka.interfaces;

public class Father implements FamilyMember{

    private String name;

    public Father(String name) {
        this.name = name;
    }

//    @Override
//    public void introduceYourself() {
//        System.out.println("I'm your father");
//        System.out.println("My name is " + name);
//    }

    @Override
    public boolean isAdult() {
        return true;
    }
}
