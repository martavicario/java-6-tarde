import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);

        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            int numero = it.next();
            if (numero % 2 != 0) {
                it.remove();
            }
        }

        System.out.println("Lista después de eliminar impares: " + numeros);
    }
}
