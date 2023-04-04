package interfacesCanHaveStaticMethods;

public class Main {
    public static void main(String[] args) {
        demo demoObj = new demoImpl();

        demoObj.welcome();
        demo.thankYou();


    }
}