public class AeropuertoPublico extends Aeropuerto {
    private double financiacion;
    private int trabajadoresDiscapacitados;

    public AeropuertoPublico() {
        super();
        this.financiacion = 0;
        this.trabajadoresDiscapacitados = 0;
    }

    public AeropuertoPublico(String nombre, int anio, int capacidad, double financiacion, int discapacitados) {
        super(nombre, anio, capacidad);
        this.financiacion = financiacion;
        this.trabajadoresDiscapacitados = discapacitados;
    }

    public double getFinanciacion() { return financiacion; }
    public int getTrabajadoresDiscapacitados() { return trabajadoresDiscapacitados; }

    public void setFinanciacion(double financiacion) { this.financiacion = financiacion; }
    public void setTrabajadoresDiscapacitados(int n) { this.trabajadoresDiscapacitados = n; }

    @Override
    public void gananciasTotales(double cantidad) {
        double total = cantidad + financiacion + (1000 * trabajadoresDiscapacitados);
        System.out.println("Ganancias totales (público): " + total + "€");
    }

    @Override
    public String toString() {
        return super.toString() +
               " | Público - Financiación: " + financiacion +
               "€, Trabajadores discapacitados: " + trabajadoresDiscapacitados;
    }
}
