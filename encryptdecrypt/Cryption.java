package encryptdecrypt;

import java.util.Scanner;

public interface Cryption {

    Scanner scanner = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    String executeUnicode(String msg, int shift);

    String executeShift(String msg, int shift);

}
