package encryptdecrypt;

import java.util.Scanner;

public interface Cryption {

    Scanner scanner = new Scanner(System.in);

    String execute(String msg, int shift);

}
