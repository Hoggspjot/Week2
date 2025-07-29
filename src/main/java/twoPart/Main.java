package twoPart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList();
        System.out.println("Размер листа после создания - "+myArrayList.getSize());
        System.out.println("--------------------------------------");

        myArrayList.add(1);
        myArrayList.add(2);

        System.out.println("Получаем текущий размер листа(Добавили 2 элемента)  - "+myArrayList.getSize());

        myArrayList.add(3);
        myArrayList.add(4);

        System.out.println("Получаем текущий размер листа(Добавили еще 2 элемента)  - "+myArrayList.getSize());
        System.out.println("--------------------------------------");
        System.out.println("Элементы листа на текущий момент");
        myArrayList.print();
        System.out.println("Получаем элемент по индексу 2 - "+myArrayList.get(2));

        System.out.println("--------------------------------------");

        myArrayList.remove(2);
        System.out.println("Получаем текущий размер листа(удалили элемент)  - "+myArrayList.getSize());
        myArrayList.print();

        System.out.println("--------------------------------------");
        System.out.println("Лист до добавления");
        myArrayList.print();
        List<Integer> list = Arrays.asList(5, 6, 7, 8);
        myArrayList.addAll(list);
        System.out.println("Лист после добавления");
        myArrayList.print();
        System.out.println("Получаем текущий размер листа(добавили элементы другого листа)  - " + myArrayList.getSize());
    }
}
