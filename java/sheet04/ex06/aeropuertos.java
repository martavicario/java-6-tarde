public abstract class Aeropuerto {
    private static int contadorId = 1;

    private int id;
    private String nombre;
    private int anioInauguracion;
    private int capacidad;

    public Aeropuerto() {
        this.id = contadorId++;
        this.nombre = "Sin nombre";
        this.anioInauguracion = 2000;
        this.capacidad = 0;
    }

    public Aeropuerto(String nombre, int anioInauguracion, int capacidad) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.anioInauguracion = anioInauguracion;
        this.capacidad = capacidad;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getAnioInauguracion() { return anioInauguracion; }
    public int getCapacidad() { return capacidad; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setAnioInauguracion(int anio) { this.anioInauguracion = anio; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public abstract void gananciasTotales(double cantidad);

    @Override
    public String toString() {
        return "Aeropuerto #" + id + ": " + nombre +
               " | Inaugurado en: " + anioInauguracion +
               " | Capacidad: " + capacidad;
    }
}
