package dzien6_exceptions.dzien7_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayListDemo {

    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.remove(0);


        System.out.println(list1);

        System.out.println(list1.indexOf(2));

        System.out.println(list1.size());
    }

}
