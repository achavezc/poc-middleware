package pe.compartamos.clientes.util;

public class ClienteUtil {
    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }
}