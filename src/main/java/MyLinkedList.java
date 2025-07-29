import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList<E> implements Iterable<E> {
    private int size = 0;
    private Node<E> first;
    private Node<E> last;


    private void firstNode(E element) {
        Node<E> f = first;
        Node<E> newNode = new Node<>(element, null,f);
        first = newNode;
        size++;
    }

    private void lastNode(E element) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(element, l, null);
        last = newNode;
        size++;
    }

    public void add(E element) {
        if (size == 0) {
            firstNode(element);
        } else {
            lastNode(element);
        }
    }

    public void add(E element , int index) {
        checkIndex(index);
        Node<E> tempNode;

        for (int i = 0; i < size; i++) {

        }

        Node<E> newNode = new Node<>()
    }




    @Override
    public Iterator<E> iterator() {
        return null;
    }


    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Выход за пределы массива");
        }
    }


    private static class Node<E> {
        E value;
        Node<E> next;
        Node<E> prev;

        public Node(E value, Node<E> prev, Node<E> next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }




}
