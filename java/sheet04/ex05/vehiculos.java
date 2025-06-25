public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo() {
        this.marca = "Sin marca";
        this.modelo = "Sin modelo";
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }

    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
}

class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche() {
        super(); 
        this.numeroPuertas = 4;
    }

    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() { return numeroPuertas; }

    public void setNumeroPuertas(int numeroPuertas) { this.numeroPuertas = numeroPuertas; }

    public String toString() {
        return super.toString() + ", Puertas: " + numeroPuertas;
    }
}

class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto() {
        super();
        this.tieneSidecar = false;
    }

    public Moto(String marca, String modelo, boolean tieneSidecar) {
        super(marca, modelo);
        this.tieneSidecar = tieneSidecar;
    }

    public boolean getTieneSidecar() { return tieneSidecar; }

    public void setTieneSidecar(boolean tieneSidecar) { this.tieneSidecar = tieneSidecar; }

    public String toString() {
        return super.toString() + ", Sidecar: " + (tieneSidecar ? "Sí" : "No");
    }
}

class CocheDeportivo extends Coche {
    private boolean descapotable;

    public CocheDeportivo() {
        super();
        this.descapotable = false;
    }

    public CocheDeportivo(String marca, String modelo, int puertas, boolean descapotable) {
        super(marca, modelo, puertas);
        this.descapotable = descapotable;
    }

    public boolean isDescapotable() { return descapotable; }

    public void setDescapotable(boolean descapotable) { this.descapotable = descapotable; }

    public String toString() {
        return super.toString() + ", Descapotable: " + (descapotable ? "Sí" : "No");
    }
}
