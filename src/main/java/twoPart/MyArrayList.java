package twoPart;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<E> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] array;
    private int size;


    MyArrayList() {
        this.array = new Object[INITIAL_CAPACITY];
        size = 0;
    }


    public int getSize() {
        return size;
    }

    public void add(E element) {
        checkCapacity(size + 1);
        array[size++] = element;
    }

    public E get(int index) {
        checkIndex(index);
        return (E) array[index];

    }

    public void remove(int index) {
        checkIndex(index);
        int newIndex = 0;
        Object[] newArray = new Object[size];
        for (int i = 0; i < size; i++) {
            if (i != index) {
                newArray[newIndex] = array[i];
                newIndex++;
            }

        }
        array = newArray;
        size--;
    }

    public void addAll(Collection<? extends E> c) {
        int firstArraySize = size;
        Object[] a = c.toArray();
        if (a.length == 0) {
            System.out.println("Лист пуст");
        }
        if ((size + a.length) > array.length) {
            grow(size + a.length);

        }
        for (int i = 0; i < a.length; i++) {
            array[i+firstArraySize] = a[i];
            size++;
        }

    }


    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Выход за пределы массива");
        }
    }


    private void checkCapacity(int size) {
        if (size > array.length - 1) {
            grow(array.length);
        }
    }

    private void grow(int size) {
        int newSize = size * 2;
        Object[] newArray = new Object[newSize];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
        public void print() {
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

    }
