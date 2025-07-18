public class ThreadExample {
    public static void main(String[] args) {
        Thread hilo = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    System.out.println("El hilo fue interrumpido.");
                }
            }
        });

        hilo.start(); 
    }
}
