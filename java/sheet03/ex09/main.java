import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExExample {
    public static void main(String[] args) {
        String[] correos = {"test@example.com", "adiasfd.com"};

        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);

        for (String correo : correos) {
            Matcher matcher = pattern.matcher(correo);
            if (matcher.matches()) {
                System.out.println(correo + " es un correo válido.");
            } else {
                System.out.println(correo + " no es un correo válido.");
            }
        }
    }
}
