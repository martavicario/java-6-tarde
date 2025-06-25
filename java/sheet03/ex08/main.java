public class ExceptionExample {

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int resultado = divide(10, 2);
            System.out.println("Resultado: " + resultado);

            resultado = divide(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero");
        }
    }
}
