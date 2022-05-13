package encryptdecrypt;

public class Main {

    public static void main(String[] args) {

        String s = "enc";
        String msg = "";
        int n = 0;

        for (int i = 0; i < args.length; i++) {
            if ("-mode".equals(args[i])) {
                s = args[i + 1];
            }
            if ("-key".equals(args[i])) {
                n = Integer.parseInt(args[i + 1]);
            }
            if ("-data".equals(args[i])) {
                msg = args[i + 1];
            }
        }


        if ("enc".equalsIgnoreCase(s)) {
            System.out.println(new Encryption().execute(msg, n));
        } else {
            System.out.println(new Decryption().execute(msg, n));
        }
    }

}
