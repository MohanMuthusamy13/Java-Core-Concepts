package immutableclass;

public class Student {
    private final long id;
    private final String name;
    private final Address address;

    public Student(long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // todo : cloning of mutable behaviour
//    public Address getAddress() {
//        return new Address(address.getState(), address.getCountry());
//    }

    // todo : we can also use copy constructor to clone the mutable property
    public Address getAddress() {
        return new Address(address);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}