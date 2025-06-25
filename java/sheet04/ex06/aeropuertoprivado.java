public class AeropuertoPrivado extends Aeropuerto {
    private int numeroSocios;

    public AeropuertoPrivado() {
        super();
        this.numeroSocios = 1; 
    }

    public AeropuertoPrivado(String nombre, int anio, int capacidad, int socios) {
        super(nombre, anio, capacidad);
        this.numeroSocios = socios > 0 ? socios : 1;
    }

    public int getNumeroSocios() { return numeroSocios; }
    public void setNumeroSocios(int numeroSocios) {
        this.numeroSocios = numeroSocios > 0 ? numeroSocios : 1;
    }

    @Override
    public void gananciasTotales(double cantidad) {
        double porSocio = cantidad / numeroSocios;
        System.out.println("Ganancias por socio (privado): " + porSocio + "€");
    }

    @Override
    public String toString() {
        return super.toString() + " | Privado - Socios: " + numeroSocios;
    }
}
