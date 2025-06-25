public class Ordenador {
    private String marca;
    private String modelo;
    private int ram; 
    private int capacidadDisco; 
    private int espacioUtilizado; 
    private boolean encendido;

    public Ordenador() {
        this.marca = "";
        this.modelo = "";
        this.ram = 4;
        this.capacidadDisco = 50;
        this.espacioUtilizado = 0;
        this.encendido = false;
    }

    public Ordenador(int ram) {
        this();
        if (!esPotenciaDe2(ram)) throw new IllegalArgumentException("La RAM debe ser potencia de 2.");
        this.ram = ram;
    }

    public Ordenador(int ram, int capacidadDisco) {
        this(ram);
        this.capacidadDisco = capacidadDisco;
    }

    public Ordenador(String marca, String modelo, int ram, int capacidadDisco) {
        if (!esPotenciaDe2(ram)) throw new IllegalArgumentException("La RAM debe ser potencia de 2.");
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.capacidadDisco = capacidadDisco;
        this.espacioUtilizado = 0;
        this.encendido = false;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getRam() { return ram; }
    public void setRam(int ram) {
        if (!esPotenciaDe2(ram)) throw new IllegalArgumentException("La RAM debe ser potencia de 2.");
        this.ram = ram;
    }

    public int getCapacidadDisco() { return capacidadDisco; }
    public void setCapacidadDisco(int capacidadDisco) { this.capacidadDisco = capacidadDisco; }

    public int getEspacioUtilizado() { return espacioUtilizado; }
    public void setEspacioUtilizado(int espacioUtilizado) { this.espacioUtilizado = espacioUtilizado; }

    public boolean isEncendido() { return encendido; }
    public void setEncendido(boolean encendido) { this.encendido = encendido; }

    public void encender() {
        encendido = true;
        System.out.println("Ordenador encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("Ordenador apagado.");
    }

    public void transferirArchivos(int gb) {
        if (!encendido) {
            System.out.println("El ordenador está apagado. No se pueden transferir archivos.");
            return;
        }
        if (espacioUtilizado + gb > capacidadDisco) {
            System.out.println("No hay suficiente espacio en disco.");
        } else {
            espacioUtilizado += gb;
            System.out.println("Se han transferido " + gb + "GB al ordenador.");
        }
    }

    public void eliminarArchivos(int gb) {
        if (!encendido) {
            System.out.println("El ordenador está apagado. No se pueden eliminar archivos.");
            return;
        }
        espacioUtilizado -= gb;
        if (espacioUtilizado < 0) espacioUtilizado = 0;
        System.out.println("Se han eliminado " + gb + "GB del ordenador.");
    }

    private boolean esPotenciaDe2(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Ordenador)) return false;
        Ordenador otro = (Ordenador) obj;
        return this.marca.equals(otro.marca) && this.modelo.equals(otro.modelo);
    }

    @Override
    public String toString() {
        return "Ordenador " + marca + " " + modelo +
               " | RAM: " + ram + "GB" +
               " | Disco: " + capacidadDisco + "GB" +
               " | Utilizado: " + espacioUtilizado + "GB" +
               " | Encendido: " + (encendido ? "Sí" : "No");
    }
}
