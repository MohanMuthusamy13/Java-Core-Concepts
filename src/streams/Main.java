package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> people = getPeople();

        /*
        List<streams.Person> males = new ArrayList<>();

        for (streams.Person person : people) {
            if (person.getGender().equals(streams.Gender.MALE)) {
                males.add(person);
            }
        }

        males.forEach(System.out::println);
         */

        // streams

        // 1 FILTER

        List<Person> males = people.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .collect(Collectors.toList());

//        males.forEach(System.out::println);

        // 2 SORT

        List<Person> females = people.stream()
                .filter(person -> (person.getGender().equals(Gender.FEMALE)))
                .sorted(Comparator.comparing(Person::getAge).reversed() )
                .collect(Collectors.toList());

//        females.forEach(System.out::println);

        // 3 ALL MATCH

        boolean allAreBigGuys = people.stream()
                .allMatch(person -> person.getAge() > 10);
//        System.out.println(allAreBigGuys);

        boolean allAreMatured = people.stream()
                .allMatch(person -> person.getAge() > 18);
//        System.out.println(allAreMatured);


        // ANY MATCH

        boolean anyOfThemAreMatured = people.stream()
                .anyMatch(person -> person.getAge() > 18);

//        System.out.println(anyOfThemAreMatured);

        // NONE MATCH

        boolean isNotPresent = people.stream().noneMatch(person -> person.getName().equals("MohanRaj"));

//        System.out.println(isNotPresent);

        // MAX

//         people.stream()
//                 .max(Comparator.comparing(streams.Person::getAge))
//                 .ifPresent(System.out::println);

         // MIN

//         people.stream()
//                 .min(Comparator.comparing(streams.Person::getAge))
//                 .ifPresent(System.out::println);

         // GROUP BY GENDER

         Map<Gender, List<Person>> groupByGender =
                 people.stream().collect(Collectors.groupingBy(Person::getGender));

//        groupByGender.forEach((streams.Gender, personList) -> {
//            System.out.println(streams.Gender);
//            personList.forEach(System.out::println);
//        });

        Map<Integer, List<Person>> groupByAge =
                people.stream().collect(Collectors.groupingBy(Person::getAge));

//        groupByAge.forEach((age, personList) -> {
//            System.out.printf("Age group : %d\n", age);
//            personList.forEach((System.out::println));
//        });


        // filter -- 18
        // sort by age descending
        // group by gender

        Map<Gender, List<Person>> groupByGenderSortedByAge = people.stream()
                .filter((person -> person.getAge() > 18))
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.groupingBy(Person::getGender));

//        groupByGenderSortedByAge.forEach((gender, personList) -> {
//            System.out.println(gender);
//            personList.forEach(System.out::println);
//        });
//
//        Map<Integer, List<streams.Person>> groupByAgeMale = people.stream()
//                .filter(person -> person.getGender().equals(streams.Gender.MALE))
//                .sorted(Comparator.comparing(streams.Person::getName))
//                .collect(Collectors.groupingBy(streams.Person::getAge));
//
//        groupByAgeMale.forEach((age, personList) -> {
//            System.out.printf("Age group : %d\n", age);
//            personList.forEach(System.out::println);
//        });

        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .map(Person::getName)
                .ifPresent(
                        System.out::println
                );







    }

    public static List<Person> getPeople() {
        return List.of(
                new Person("John", 23, Gender.MALE),
                new Person("Sumathi", 37, Gender.FEMALE),
                new Person("Mohan", 21, Gender.MALE),
                new Person("Siva", 21, Gender.MALE),
                new Person("Sudha", 38, Gender.FEMALE),
                new Person("Harthika", 12, Gender.FEMALE)
        );
    }


}