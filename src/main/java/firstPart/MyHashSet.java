package firstPart;

import java.util.HashMap;
import java.util.Iterator;


public class MyHashSet<E> implements Iterable<E> {
    private HashMap<E, Object> myHashSet;
    private static final Object object = new Object();


    public MyHashSet() {
        myHashSet = new HashMap<>();
    }

    public boolean add(E element) {
        myHashSet.put(element, object);
        return object == null;
    }


    public boolean remove(E element) {
        return myHashSet.remove(element) == null;
    }

    @Override
    public Iterator iterator() {
        return myHashSet.keySet().iterator();
    }

    @Override
    public String toString() {
        return "MyHashSet = {" + myHashSet.keySet() +
                '}';
    }
}
