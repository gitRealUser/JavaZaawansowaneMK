package powtorka.collections;

import java.lang.reflect.Array;
import java.util.*;

public class MyArrayList <E> implements List<E> {


    private E[] elements = (E[]) new Object[10];

    @Override
    public boolean add(E e) {
        for(int i = 0; i < elements.length; i++){
            if(size() == 0){
                rise();
            }
            if(elements[i] == null){
                elements[i] = e;
                return true;
            }
        }
        return false;
    }

    public void rise(){

//        E[] newArrayList = (E[]) new Object[elements.length*2];
        elements = Arrays.copyOf(elements,elements.length*2);

    }



    @Override
    public int size() {
        for(int i = 0; i < elements.length; i++){
            if(elements[i] == null){
                return i;
            }
        }
        return 0;
    }



    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
