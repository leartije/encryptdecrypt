package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String msg = scanner.nextLine();
        int a = scanner.nextInt() % 25;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < msg.length(); i++) {
            char current = msg.charAt(i);
            if (Character.isLetter(current)) {
                if (Character.isUpperCase(current)) {
                    int n = current + a <= 90 ? current + a : (current + a) - 90 + 64;
                    sb.append((char) n);
                }
                if (Character.isLowerCase(current)) {
                    int m = current + a <= 122 ? current + a : (current + a) - 122 + 96;
                    sb.append((char) m);
                }

            } else {
                sb.append(current);
            }

        }

        System.out.println(sb);

    }
}
