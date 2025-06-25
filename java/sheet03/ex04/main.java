import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> personas = new HashMap<>();

        personas.put("Juan", 30);
        personas.put("Ana", 25);
        personas.put("Luis", 35);

        for (Map.Entry<String, Integer> entrada : personas.entrySet()) {
            System.out.println(entrada.getKey() + " tiene " + entrada.getValue() + " años.");
        }
    }
}
