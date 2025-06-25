import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> palabras = new LinkedList<>();

        palabras.add("Hola");
        palabras.add("Mundo");
        palabras.add("Java");

        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
