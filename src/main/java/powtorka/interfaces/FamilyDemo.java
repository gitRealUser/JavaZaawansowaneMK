package powtorka.interfaces;

import java.util.ArrayList;
import java.util.List;

public class FamilyDemo {

    public static void main(String[] args) {
        FamilyMember mother = new Mother("Jola");
        mother.introduceYourself();

        FamilyMember father = new Father("Jan");
        father.introduceYourself();

        FamilyMember son = new Son("Ricky");
        son.introduceYourself();

        List<FamilyMember> list1 = new ArrayList<>();
        list1.add(mother);
        list1.add(father);
        list1.add(son);

        System.out.println(list1);
        System.out.println("+++++++++++++");



        for(FamilyMember member: list1){
            System.out.println("Is adult? " + member.isAdult());
            member.introduceYourself();

        }


    }
}
