public class Producto {
    private static int contadorId = 1;

    private int id;
    private String nombre;
    private double precio;

    public Producto() {
        this.id = contadorId++;
        this.nombre = "Sin nombre";
        this.precio = 1.0;
    }

    public Producto(String nombre, double precio) {
        if (precio <= 0) throw new IllegalArgumentException("El precio debe ser positivo.");
        this.id = contadorId++;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(double precio) {
        if (precio <= 0) throw new IllegalArgumentException("El precio debe ser positivo.");
        this.precio = precio;
    }

    public double comprar(int cantidad) {
        return precio * cantidad;
    }

    @Override
    public String toString() {
        return "Producto #" + id + ": " + nombre + " - Precio: " + precio + "€";
    }
}

class ProductoFresco extends Producto {
    private int diasCaducidad;

    public ProductoFresco() {
        super();
        this.diasCaducidad = 7;
    }

    public ProductoFresco(String nombre, double precio, int diasCaducidad) {
        super(nombre, precio);
        this.diasCaducidad = diasCaducidad;
    }

    public int getDiasCaducidad() { return diasCaducidad; }
    public void setDiasCaducidad(int diasCaducidad) { this.diasCaducidad = diasCaducidad; }


    @Override
    public double comprar(int cantidad) {
        double precio = getPrecio();
        if (diasCaducidad < 3) {
            precio *= 0.3;
        } else if (diasCaducidad <= 5) {
            precio *= 0.6;
        }
        return precio * cantidad;
    }

    @Override
    public String toString() {
        return super.toString() + " | Fresco - Caduca en: " + diasCaducidad + " días";
    }
}

class ProductoRefrigerado extends Producto {
    private String cajon;

    public ProductoRefrigerado() {
        super();
        this.cajon = "A1";
    }

    public ProductoRefrigerado(String nombre, double precio, String cajon) {
        super(nombre, precio);
        this.cajon = cajon;
    }

    public String getCajon() { return cajon; }
    public void setCajon(
