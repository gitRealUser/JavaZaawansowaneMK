package test.inheritance;

import test.monsters.Monster;
import test.monsters.Skeleton;
import test.monsters.Zombie;

public class Inheritance {

    public static void main(String[] args) {


        Monster monster2 = new Zombie(20,20);
        monster2.attack();
        monster2.showSpeed();

//        Monster monster1 = new Monster(100,99);
//        monster1.attack();
//        monster1.showSpeed();
//        System.out.println("...........");
//
//        Zombie zombie1 = new Zombie(1000,999);
//        zombie1.attack();
//        zombie1.showSpeed();
//        System.out.println("...........");
//
//        Skeleton skeleton1 = new Skeleton();
//        skeleton1.attack();
//        skeleton1.showSpeed();
//        System.out.println("...........");




    }


}
