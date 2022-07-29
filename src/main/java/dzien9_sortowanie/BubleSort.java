package dzien9_sortowanie;

import java.util.LinkedList;
import java.util.List;

public class BubleSort {

    public List<Integer> sortSet(List<Integer> list) {

        for (int j = 0; j < list.size() - 1; j++) {
            for (int i = 0; i < list.size() - 1; i++) {
                Integer firstNumber = list.get(i);
                Integer secondNumber = list.get(i + 1);
                if (firstNumber > secondNumber) {
                    list.set(i, secondNumber);
                    list.set(i + 1, firstNumber);
                }
            }
        }

        return list;
    }

}

class BubleSortDemo {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(List.of(10, 6, 8, 5, 3));
        BubleSort bubleSort = new BubleSort();
        System.out.println(bubleSort.sortSet(list));

    }


}