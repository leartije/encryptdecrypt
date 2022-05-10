package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String msg = "we found a treasure!";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < msg.length(); i++) {
            char current = msg.charAt(i);
            if (Character.isLetter(current)) {
                if (Character.isUpperCase(current)) {
                    int n = 90 - ((current + 25) % 90);
                    sb.append((char) n);
                }
                if (Character.isLowerCase(current)) {
                    int m = 122 - ((current + 25) % 122);
                    sb.append((char) m);
                }

            } else {
                sb.append(current);
            }

        }

        System.out.println(sb);

    }
}
