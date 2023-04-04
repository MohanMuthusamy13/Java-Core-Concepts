package objectsKeyword;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(
                "Luna", "BewBow!", new Breed("Pomeraian", "America")
        );

        // TODO : BREED SHOULD NOT BE NULL
//        Dog dog = new Dog(
//                "Luna", "BewBow!",null
//        );
        System.out.println(dog);
    }
}