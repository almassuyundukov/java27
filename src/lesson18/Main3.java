package lesson18;

import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;

public class Main3 {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(1024);
        KeyPair keyPair = generator.generateKeyPair();
        // Encrypt with PRIVATE KEY
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, keyPair.getPublic());
        byte[] data = cipher.doFinal("Hello!".getBytes());
        // Decrypt with PUBLIC KEY
        cipher.init(Cipher.DECRYPT_MODE, keyPair.getPrivate());
        byte[] result = cipher.doFinal(data);
        System.out.println(new String(result));
    }
}
