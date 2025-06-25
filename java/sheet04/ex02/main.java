public class Main {
    public static void main(String[] args) {
        try {
            Ordenador pc1 = new Ordenador("Dell", "XPS", 8, 500);
            System.out.println(pc1);

            pc1.encender();

            pc1.transferirArchivos(100);
            System.out.println(pc1);

            pc1.eliminarArchivos(50);
            System.out.println(pc1);

            pc1.transferirArchivos(500); // debería fallar

            Ordenador pc2 = new Ordenador("Dell", "XPS", 16, 1000);
            System.out.println("¿pc1 es igual a pc2? " + pc1.equals(pc2));

            pc1.apagar();

            pc1.transferirArchivos(10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear el ordenador: " + e.getMessage());
        }
    }
}
