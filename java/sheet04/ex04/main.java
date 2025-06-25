public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Pan", 1.5);
        System.out.println(p1);
        System.out.println("Total por 3 unidades: " + p1.comprar(3) + "€");

        ProductoFresco pf1 = new ProductoFresco("Lechuga", 2.0, 2);
        System.out.println("\n" + pf1);
        System.out.println("Total por 2 unidades: " + pf1.comprar(2) + "€");

        ProductoRefrigerado pr1 = new ProductoRefrigerado("Yogur", 1.2, "C3");
        System.out.println("\n" + pr1);
        System.out.println("Total por 4 unidades: " + pr1.comprar(4) + "€");
    }
}
