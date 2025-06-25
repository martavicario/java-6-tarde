public class Prestamo implements Prestable {
    private double cantidad;
    private double adeudo;
    private String titular;

    public Prestamo(double cantidad, String titular) {
        this.cantidad = cantidad;
        this.titular = titular;
        this.adeudo = 0;
    }

    public double getCantidad() { return cantidad; }
    public String getTitular() { return titular; }

    @Override
    public void prestar() {
        System.out.println("Prestando " + cantidad + "€ a " + titular);
        adeudo += cantidad * 1.05; 
    }

    @Override
    public void devolver() {
        System.out.println(titular + " devuelve " + cantidad + "€");
        adeudo -= cantidad;
        if (adeudo < 0) adeudo = 0;
    }
}
