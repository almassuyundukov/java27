package lesson17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyWithNio implements CopyUtils{

    @Override
    public void copy(String from, String to) {
        Path copied = Paths.get(to);
        Path originalPath = Paths.get(from);
        try {
            Files.copy(originalPath, copied, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
