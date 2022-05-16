package encryptdecrypt;

import encryptdecrypt.IOfiles.WriteFile;

public class Main {
    public static void main(String[] args) {

        ParseCL parseCL = new ParseCL();
        parseCL.parse(args);

        if (parseCL.getOut() != null) {
            String msg;
            if ("enc".equalsIgnoreCase(parseCL.getMode())) {
                msg = new Context(new Encryption()).execute(
                        parseCL.getData(),
                        parseCL.getKey(),
                        parseCL.getAlg()
                );
            } else {
                msg = new Context(new Decryption()).execute(
                        parseCL.getData(),
                        parseCL.getKey(),
                        parseCL.getAlg()
                );
            }
            WriteFile.writeToFile(parseCL.getOut(), msg);
        } else {
           if ("enc".equalsIgnoreCase(parseCL.getMode())) {
               System.out.println(new Context(new Encryption()).execute(
                       parseCL.getData(),
                       parseCL.getKey(),
                       parseCL.getAlg()
               ));
           } else {
               System.out.println(new Context(new Decryption()).execute(
                       parseCL.getData(),
                       parseCL.getKey(),
                       parseCL.getAlg()
               ));
           }
        }
    }
}
