
import java.util.regex.*;


/**
 *
 * @author Mauricio, Lidiane, Adan, Igor
 */
public class ValidaEmail {
    // Valida email

    public boolean validaEmail(String email) {
        System.out.println("Metodo de validacao de email");
        Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$");
        Matcher m = p.matcher(email);
        if (m.find()) {
            return true;
        } else {
            return false;
        }
    }
}
