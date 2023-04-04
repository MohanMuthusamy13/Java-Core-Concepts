package immutableclass;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("TamilNadu", "India");
        Student student = new Student(1L, "MohanRaj", address);

        System.out.println(student);

        // WE SHOULD BE CAREFUL ABOUT THE MUTABLE PROPERTIES THAT IS PRESENT
        // IN THE IMMUTABLE CLASS AS TAT BROKES THE IMMUTABLE BEHAVIOUR

        // TODO : WE SHOULD ALWAYS CLONE THE MUTABLE PROPERTIES AND PROVIDE TO THE END USER
        //  SO THAT HE CANT ABLE TO CHANGE THE BEHAVIOUR OF THE IMMUTABLE CLASS

        Address newAddress = student.getAddress();
        newAddress.setState("Chicago");
        newAddress.setCountry("USA");

        System.out.println(student);
    }
}