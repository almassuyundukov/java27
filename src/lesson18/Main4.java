package lesson18;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main4 {
    public static void main(String[] args) {
        try {
            MessageDigest digester = MessageDigest.getInstance("SHA-512");
            byte[] input = "Secret string".getBytes();
            byte[] digest = digester.digest(input);
            System.out.println(DatatypeConverter.printHexBinary(digest));
            // 1) расшифровать данные, которые зашифровали выше
            // 2) самостоятельно разобрать 1+ способ шифрования данных
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }
}
