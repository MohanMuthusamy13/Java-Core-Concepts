package composition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(
                "MohanRaj", new Cat("Luna")
        );
//        System.out.println(person);

//        List<? extends String> namesList = new ArrayList<>(Arrays.asList("John", "Mohan"));
//        System.out.println(namesList);

        // WONT COMPILE
        List<Pet> pets = new ArrayList<Pet>(Arrays.asList(new Cat("Muow")));
        pets.add(new Cat("Pow"));
        System.out.println(pets);

        List<Pet> pettss = new ArrayList<>(List.of(new Cat("Muow"), new Dog("DowBow")));
        System.out.println(pettss);
    }
}