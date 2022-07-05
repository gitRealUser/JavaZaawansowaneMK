package dzien3;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> first = new ArrayList<>();

        System.out.println(first.contains(1));
        System.out.println(first.isEmpty());

        first.add(20);
        first.add(30);
        first.add(40);

        System.out.println(first);

        System.out.println(first.get(0)+ first.get(1));

        first.remove(2);
        System.out.println(first);
        first.add(99);
        System.out.println(first);
        first.add(0,888);
        System.out.println(first);
        System.out.println(first.contains(30));



    }
}
