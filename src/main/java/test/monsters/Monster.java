package test.monsters;

public class Monster {

    double speed = 10;
    double HP;

   public Monster (){
       System.out.println("default constructor from Monster class!");

    }
    public Monster (double speed, double HP){
        System.out.println("two-argument constructor from Monster class!");
       this.HP = HP;
       this.speed = speed;
    }

    public void showSpeed(){
        System.out.println("Speed is " + speed);
    }



    public void attack (){
        System.out.println("Monster attack!");
    }
}
