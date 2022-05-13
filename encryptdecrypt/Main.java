package encryptdecrypt;

public class Main {

    public static void main(String[] args) {

        String s = Encryption.scanner.nextLine();
        String msg = Encryption.scanner.nextLine();
        int n = Encryption.scanner.nextInt();

        if ("enc".equalsIgnoreCase(s)) {
            System.out.println(new Encryption().execute(msg, n));
        } else {
            System.out.println(new Decryption().execute(msg, n));
        }
    }

}
