package lesson17;

import java.io.File;
import java.io.IOException;

public class CopyWithGuava implements CopyUtils{

    @Override
    public void copy(String from, String to) {
        File copied = new File(to);
        File original = new File(from);
        try {
            com.google.common.io.Files.copy(original, copied);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
