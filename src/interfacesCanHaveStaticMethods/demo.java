package interfacesCanHaveStaticMethods;

public interface demo {

    void welcome();

    static void thankYou() {
        System.out.println("Thank you! :)");
    }
}