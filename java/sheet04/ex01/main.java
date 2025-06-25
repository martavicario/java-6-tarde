public class main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1605);
        System.out.println(libro1.toString());

        libro1.prestar();
        System.out.println(libro1.toString());

        double precio = libro1.calcularPrecio(10);
        System.out.println("Precio con descuento: " + precio);

        libro1.devolver();
        System.out.println(libro1.toString());
    }
}