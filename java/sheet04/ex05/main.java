public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Toyota", "Corolla");
        System.out.println("Vehículo: " + v1);

        Coche c1 = new Coche("Ford", "Focus", 5);
        System.out.println("Coche: " + c1);

        Moto m1 = new Moto("Harley", "Street", true);
        System.out.println("Moto: " + m1);

        CocheDeportivo cd1 = new CocheDeportivo("Ferrari", "F8", 2, true);
        System.out.println("Coche Deportivo: " + cd1);
    }
}
