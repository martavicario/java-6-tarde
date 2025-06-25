public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30);
        
        persona.mostrarInformacion();
        
        persona.setNombre("Pedro");
        persona.setEdad(25);
        
        System.out.println("Información actualizada:");
        persona.mostrarInformacion();
    }
}