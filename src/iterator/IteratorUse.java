package iterator;

import java.util.*;

public class IteratorUse {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of(
                "Mohan",
                "Siva"
        ));
        Iterator<String> iterator = strings.iterator();

//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        Map<Integer, String> map = new HashMap<>() {{
            put(1, "Mohan");
            put(2, "Siva");
        }};

        Iterator<Map.Entry<Integer, String>> mapIterator = map.entrySet().iterator();

        while(mapIterator.hasNext()) {
            System.out.println(mapIterator.next());
        }



    }




}