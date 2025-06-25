public class Main {
    public static void main(String[] args) {
        Lista<String> miLista = new Lista<>(5);

        miLista.aniadir("Hola");
        miLista.aniadir("Adiós");
        miLista.aniadir("Java");

        System.out.println("Elementos en la lista:");
        miLista.listar();

        System.out.println("\nPosición de 'Java': " + miLista.posicion("Java"));
        System.out.println("Eliminar 'Hola': " + miLista.eliminar("Hola"));
        System.out.println("Tamaño actual: " + miLista.tamanio());

        System.out.println("\nLista después de eliminar:");
        miLista.listar();

        System.out.println("\nVaciando la lista...");
        miLista.vaciar();

        miLista.listar();
    }
}
