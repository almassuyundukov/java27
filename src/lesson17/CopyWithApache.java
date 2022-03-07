package lesson17;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CopyWithApache implements CopyUtils{

    @Override
    public void copy(String from, String to) {
        File copied = new File(to);
        File original = new File(from);
        try {
            FileUtils.copyFile(original, copied);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
