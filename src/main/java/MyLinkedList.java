import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements Iterable<E> {
    private int size;
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
        Node<E> l = last;
        Node<E> newNode = new Node<>(element, l, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }


    public E get(int index) {
        checkIndex(index);
        Node<E> node = getNode(index);
        return node.value;
    }


    private Node<E> getNode(int index) {
        checkIndex(index);
        Node<E> search = first;
        for (int i = 0; i < index; i++) {
            search = search.next;
        }
        return search;
    }


    public E remove(int index) {
        checkIndex(index);
        Node<E> removeNode;
        E value;

        if (index == 0) {
            removeNode = first;
            value = removeNode.value;
            first = first.next;
        } else if (index == size - 1) {
            removeNode = last;
            value = removeNode.value;
            last = last.prev;
            last.next = null;
        } else {
            removeNode = getNode(index);
            Node<E> prev = removeNode.prev;
            Node<E> next = removeNode.next;
            prev.next = next;
            next.prev = prev;
        }

        value =  removeNode.value;

        removeNode.prev = null;
        removeNode.next = null;
        removeNode.value = null;

        size--;
        return value;
    }


    public void addAll(Collection<? extends E> collection) {
        for (E value : collection) {
            add(value);
        }
    }



    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }


    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
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
        private void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private class LinkedListIterator implements Iterator<E> {

        private Node<E> iter = first;

        @Override
        public boolean hasNext() {
            return iter != null;
        }

        @Override
        public E next() {
            if (iter == null) {
                throw new NoSuchElementException();
            }
            E value = iter.value;
            iter = iter.next;
            return value;

        }
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        Node<E> temp = first;
        while (temp != null) {
            sb.append(temp.value + " ");
            temp = temp.next;
        }
        return sb.toString();
    }
}
