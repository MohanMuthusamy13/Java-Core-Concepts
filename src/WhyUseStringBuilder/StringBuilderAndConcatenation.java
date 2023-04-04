package WhyUseStringBuilder;

public class StringBuilderAndConcatenation {

    private static final int NUMBER = 1_000_000;

    // STRING CONCATENATION CREATES A NEW STRING EVERYTIME WE CONCATENATE
    // WITH THE OTHER STRING
    static void slow() {
        String s = "";
        for (int i = 0;i < NUMBER;i++) {
            s += "*";
        }
    }

    static void fast() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < NUMBER;i++) {
            sb.append("*");
        }
    }

    public static void main(String[] args) {
//        slow();
        fast();

    }


}