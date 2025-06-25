enum Departamento {
    CONTABILIDAD,
    INFORMATICA,
    DIRECCION
}

class Empresa {
    private String cif;
    private String nombre;

    public Empresa(String cif, String nombre) {
        this.cif = cif;
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " (CIF: " + cif + ")";
    }
}

public class Empleado {
    private static double salarioBase = 1000.0;

    private String dni;
    private String nombre;
    private int edad;
    private Departamento departamento;
    private boolean teletrabajo;
    private Empresa empresa;

    public Empleado() {
        this.dni = "00000000A";
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.departamento = Departamento.CONTABILIDAD;
        this.teletrabajo = false;
        this.empresa = new Empresa("X0000000", "Empresa Default");
    }

    public Empleado(String dni, String nombre, int edad, Departamento departamento, boolean teletrabajo, Empresa empresa) {
        if (!dni.matches("\\d{8}[A-Z]")) {
            throw new IllegalArgumentException("DNI inválido. Debe tener 8 números y una letra.");
        }
        if (empresa == null) {
            throw new IllegalArgumentException("La empresa no puede ser nula.");
        }

        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
        this.teletrabajo = teletrabajo;
        this.empresa = empresa;
    }

    public double calcularSueldo() {
        double sueldo = salarioBase;

        if (edad > 30) sueldo += 200;

        switch (departamento) {
            case CONTABILIDAD -> sueldo += 50;
            case INFORMATICA -> sueldo += 80;
            case DIRECCION -> sueldo += 100;
        }

        if (teletrabajo) sueldo += 30;

        return sueldo;
    }

    // e
