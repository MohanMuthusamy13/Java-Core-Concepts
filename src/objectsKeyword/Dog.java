package objectsKeyword;

import java.util.Objects;

public final class Dog {

    private final String name;
    private final String sound;
    private final Breed breed;

    public Dog(String name, String sound, Breed breed) {
        this.name = name;
        this.sound = sound;
        this.breed = Objects.requireNonNull(breed, "Breed cannot be null");
    }


    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public Breed getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                ", breed=" + breed +
                '}';
    }
}