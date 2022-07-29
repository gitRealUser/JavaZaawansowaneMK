package powtorka.collections;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @Test
    public void shouldAddThree(){

        MyArrayList<Integer> elements2 = new MyArrayList<>();

        elements2.add(11);
        elements2.add(33);
        elements2.add(22);


        assertEquals(3,elements2.size());

    }


    @Test
    public void shouldAddManyElements(){
        MyArrayList<Integer> elements2 = new MyArrayList<>();

        elements2.add(11);
        elements2.add(33);
        elements2.add(22);
        elements2.add(22);
        elements2.add(22);
        elements2.add(22);
        elements2.add(22);
        elements2.add(22);
        elements2.add(22);
        elements2.add(22);
        elements2.add(22);


        assertEquals(11,elements2.size());

    }




}