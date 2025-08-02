import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList();
        // пустой лист
        System.out.println(myLinkedList);
//        добавляем элементы

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(6);

        //выводим все элементы , toString() переопределен
        System.out.println(myLinkedList);
        // получаем элементы под номером 2 и 4
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(4));

//        удаляем элементы под номером 2 и 4

        myLinkedList.remove(2);
        // удаляем элемент по номеру 2 б теперь элемент под номером 4 это цифра 6
        System.out.println(myLinkedList.get(4));
        System.out.println(myLinkedList);
        myLinkedList.remove(4);

        //проверяем
        System.out.println(myLinkedList);

        //Создаем лист для проверки addAll
        List<Integer> list = Arrays.asList(6, 7, 8, 9);
        myLinkedList.addAll(list);
        //проверяем
        System.out.println(myLinkedList);


    }
}
