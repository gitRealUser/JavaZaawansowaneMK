package test;


import java.util.ArrayList;
import java.util.List;

public class Listy {

    public static void main(String[] args) {


        List<String> myList1 = new ArrayList<>();
        myList1.add("Marcin");
        myList1.add("Julek");
        myList1.add("Filipek");

        System.out.println(myList1.get(2));
        System.out.println(myList1.size());
        System.out.println(myList1.indexOf("Marcin"));
        myList1.remove(1);
        System.out.println(myList1);
        myList1.add(1,"Marcin");
        System.out.println(myList1);

        List<String> myList2 = new ArrayList<>();
        myList2.add("Kasia");
        myList2.add("Janek");
        System.out.println(myList2);
        myList2.addAll(0,myList1);
        System.out.println(myList2);

        for(String name: myList2){
            System.out.println(name.toUpperCase());
        }

        System.out.println(".............");

        System.out.println(myList2.get(3).charAt(4));


        for(String name: myList2){
            if(name.charAt(name.length()-1) == 'a')
            System.out.println(name);
        }




    }
}
