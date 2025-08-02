package myArrayList;

import java.util.Arrays;
import java.util.List;

public class TestString {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("Hello");
        myArrayList.add("World");
        myArrayList.print();
        System.out.println(myArrayList.getSize());
        System.out.println(myArrayList.get(1));
        myArrayList.remove(1);

        List<String> list = Arrays.asList("Bamboleyo");

        myArrayList.addAll(list);
        myArrayList.print();
    }

}
