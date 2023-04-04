package composition;

public class Cat extends Pet{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("says Meowww!");
    }

    @Override
    public String toString() {
        return "[Cat : " + super.getName() + "]";
    }
}