package dzien9_sortowanie;

import java.util.LinkedList;
import java.util.List;

public class SelectionSort {

    public List<Integer> sortSet(List<Integer> list) {

        Integer minNum = null;
        Integer minIndexMarker = null;

        for (int j = 0; j < list.size() - 1; j++) {

            for (int i = j; i < list.size() - 1; i++) {
                Integer firstNum = list.get(i);
                Integer currentNum = list.get(i + 1);

                if (i == j) {
                    if (firstNum < currentNum) {
                        minNum = list.get(i);
                        minIndexMarker = i;
                    } else if (firstNum > currentNum) {
                        minNum = list.get(i + 1);
                        minIndexMarker = i + 1;
                    }
                }
                else{
                    if (currentNum < minNum){
                        minNum = currentNum;
                        minIndexMarker = i+1;
                    }
                }
            }

            list.set(minIndexMarker,list.get(j));
            list.set(j,minNum);

        }


        return list;
    }



}


class SelectionSortDemo {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        List<Integer> list = new LinkedList<>(List.of(9, 3, 1, 20, 4, 10, 22, 0, 4));

        System.out.println(selectionSort.sortSet(list));

    }

}