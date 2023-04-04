package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static<X> X getValue(X value) {
        return value;
    }

    static <X extends List> void duplicateList(X list) {
        list.addAll(list);
    }

    // upper bound
    static double sumElementsOfList(List<? extends Number> list) {
        double sum = 0;
        for(Number element : list) {
            sum += element.doubleValue();
        }
        return sum;
    }

    // lower bound
    static void addElements(List<? super Number> list) {
        list.add(1);
        list.add(1.1);
        list.add(1L);
    }

    static String getStringValue(List<? extends String> list) {
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s.toUpperCase());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
//         MyCustomList<String> list = new MyCustomList<>();
//         list.addElement("Element 1");
//         list.addElement("Element 2");
//
//        System.out.println(list);

        System.out.println(sumElementsOfList(List.of(1.1, 2.1, 3.1)));
        System.out.println(sumElementsOfList(List.of(1, 2, 3)));

        System.out.println(getStringValue(List.of("Moji", "Hari")));


        MyCustomList<Long> list = new MyCustomList<>();
        list.addElement(1L);
        list.addElement(2L);

        System.out.println(list);

         MyCustomList<Integer> list1 = new MyCustomList<>();
         list1.addElement(1);
         list1.addElement(2);

        System.out.println(list1);

        System.out.println(list.getElement(0));
        System.out.println(list1.getElement(1));

        MyCustomSet<String> set = new MyCustomSet<>();

        set.addElement("1");
        set.addElement("1");


        System.out.println(getValue(Integer.valueOf(1)));
        System.out.println(getValue("ej"));

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        duplicateList(list2 );
    }
}