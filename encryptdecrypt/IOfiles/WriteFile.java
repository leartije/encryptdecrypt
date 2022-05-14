package encryptdecrypt.IOfiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static boolean writeToFile(File fileName, String msg) {
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(msg);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
