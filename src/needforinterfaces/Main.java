package needforinterfaces;

public class Main {
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        DevApp devAppObj = new DevApp();
        devAppObj.devApp(laptop);
        devAppObj.devApp(desktop);

    }
}