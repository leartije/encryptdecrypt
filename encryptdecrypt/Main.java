package encryptdecrypt;

import encryptdecrypt.IOfiles.WriteFile;

public class Main {

    public static void main(String[] args) {


        ParseCL parseCL = new ParseCL();
        parseCL.parse(args);

        if ("data".equals(parseCL.getData())) {
            if ("enc".equalsIgnoreCase(parseCL.getMode())) {
                System.out.println(new Encryption().execute(parseCL.getData(), parseCL.getKey()));
            } else {
                System.out.println(new Decryption().execute(parseCL.getData(), parseCL.getKey()));
            }
        } else {
            if ("enc".equalsIgnoreCase(parseCL.getMode())) {
                String enc = new Encryption().execute(parseCL.getData(), parseCL.getKey());
                WriteFile.writeToFile(parseCL.getOut(), enc);
            } else {
                String dec = new Decryption().execute(parseCL.getData(), parseCL.getKey());
                WriteFile.writeToFile(parseCL.getOut(), dec);
            }
        }
    }

}
