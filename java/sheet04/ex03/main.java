public class Main {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("A12345678", "TechCorp");

        Empleado emp1 = new Empleado("12345678A", "Ana Torres", 35, Departamento.INFORMATICA, true, empresa1);
        Empleado emp2 = new Empleado("87654321B", "Carlos Ruiz", 28, Departamento.CONTABILIDAD, false, empresa1);

        System.out.println(emp1);
        System.out.println();
        System.out.println(emp2);

        System.out.println("\n¿Los empleados son iguales? " + emp1.equals(emp2));
    }
}
