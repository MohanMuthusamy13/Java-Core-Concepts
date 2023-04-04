package composition;

// TODO : COMPOSITION --> HAS-A BEHAVIOUR
// IT IS USED TO INTEGRATE WITH OTHER OBJECTS EG : PERSON HAS A PET

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private Pet pet;

    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "streams.Person{" +
                "name='" + name + '\'' +
                ", pet=" + pet +
                '}';
    }
}