package generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyCustomSet<E> {

    Set<E> set = new HashSet<>();

    public void addElement(E element) {
        set.add(element);
    }
}