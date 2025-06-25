public class Main {
    public static void main(String[] args) {
        AeropuertoPublico pub = new AeropuertoPublico("Barajas", 1995, 50000, 1000000, 5);
        AeropuertoPrivado priv = new AeropuertoPrivado("JetClub", 2010, 1000, 4);

        System.out.println(pub);
        pub.gananciasTotales(200000);

        System.out.println("\n" + priv);
        priv.gananciasTotales(200000);
    }
}
