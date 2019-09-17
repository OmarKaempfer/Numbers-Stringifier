package es.ulpgc;

public class NumberStringifier {
    public static String stringify(int number) {
        return number == 0 ? "zero" :
                (number == 1 ? "one" : "two");
    }
}
