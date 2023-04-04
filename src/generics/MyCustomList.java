package generics;

import java.util.ArrayList;
import java.util.List;

public class MyCustomList<T extends Number> {

    List<T> list = new ArrayList<>();

    public void addElement(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }

    public T getElement(int index) {
        return list.get(index);
    }

    @Override
    public String toString() {
        return "MyCustomList{" +
                "list=" + list +
                '}';
    }
}