import java.util.ArrayList;
import java.util.Collections;

public class LambdaExample {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Banana");
        frutas.add("Apple");
        frutas.add("Cherry");

        frutas.sort((a, b) -> a.compareToIgnoreCase(b));

        System.out.println("Lista ordenada: " + frutas);
    }
}
