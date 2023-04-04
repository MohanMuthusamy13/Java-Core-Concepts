package composition;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("says Boww!");
    }

    @Override
    public String toString() {
        return "[Dog : " + super.getName() + "]";
    }
}