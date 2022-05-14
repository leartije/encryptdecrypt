package encryptdecrypt.IOfiles;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static String readFile(File fileName) {
        StringBuilder sb = new StringBuilder();
        try (Scanner scanner = new Scanner(fileName)) {
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

}
