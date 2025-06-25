import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Producto[] productos = new Producto[4];

        productos[0] = new Producto("Pan", 1.5);
        productos[1] = new ProductoFresco("Lechuga", 2.0, 2); // caduca en 2 días
        productos[2] = new ProductoRefrigerado("Yogur", 1.2, "Z9");
        productos[3] = new ProductoFresco("Tomate", 1.8, 5); // caduca en 5 días

        Arrays.sort(productos, Comparator.comparingDouble(Producto::getPrecio));

        System.out.println("Productos ordenados por precio:");
        for (Producto p : productos) {
            System.out.println(p);
        }

        double total = 0;
        System.out.println("\nTotal por 5 unidades de cada producto:");
        for (Producto p : productos) {
            double precio = p.comprar(5);
            System.out.println(p.getNombre() + ": " + precio + "€");
            total += precio;
        }
        System.out.println("Importe total: " + total + "€");

        ProductoRefrigerado masLejano = null;
        for (Producto p : productos) {
            if (p instanceof ProductoRefrigerado pr) {
                if (masLejano == null || pr.getCajon().compareTo(((ProductoRefrigerado) masLejano).getCajon()) > 0) {
                    masLejano = pr;
                }
            }
        }
        System.out.println("\nProducto refrigerado en el cajón más alejado: " + masLejano.getNombre());

        ProductoFresco masProximo = null;
        for (Producto p : productos) {
            if (p instanceof ProductoFresco pf) {
                if (masProximo == null || pf.getDiasCaducidad() < masProximo.getDiasCaducidad()) {
                    masProximo = pf;
                }
            }
        }
        System.out.println("Producto fresco más próximo a caducar: " + masProximo.getNombre());
    }
}
