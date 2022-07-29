package test.monsters;

public class Zombie extends Monster{


    public Zombie(){
        System.out.println("default constructor from Zombie class!");
    }

    public Zombie(double speed, double HP){
        super(speed, HP);
        System.out.println("two-argument constructor from Zombie class!");
    }


    public void attack (){
        super.attack();
        System.out.println("Zombie attack!");
    }
}
