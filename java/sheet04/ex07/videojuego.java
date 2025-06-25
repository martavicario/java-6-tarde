public class VideoJuego implements Prestable {
    private String nombre;
    private double precio;
    private boolean prestado;
    private int vecesPrestado;

    public VideoJuego(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.prestado = false;
        this.vecesPrestado = 0;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            vecesPrestado++;
            System.out.println(nombre + " prestado. Veces prestado: " + vecesPrestado);
        } else {
            System.out.println(nombre + " ya está prestado.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println(nombre + " devuelto.");
        } else {
            System.out.println(nombre + " no estaba prestado.");
        }
    }
}
