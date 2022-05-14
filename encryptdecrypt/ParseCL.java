package encryptdecrypt;

import encryptdecrypt.IOfiles.ReadFile;

import java.io.File;

public class ParseCL {

    private String mode = "enc";
    private int key = 0;
    private String data = "";
    private File in;
    private File out;


    public void parse(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                if ("-data".equals(args[i])) {
                    this.data = args[i + 1];
                } else if ("-key".equals(args[i])) {
                    this.key = Integer.parseInt(args[i + 1]);
                } else if ("-mode".equals(args[i])) {
                    this.mode = args[i + 1];
                } else if ("-in".equals(args[i])) {
                    this.in = new File(args[i + 1]);
                    this.data = ReadFile.readFile(this.in);
                } else if ("-out".equals(args[i])) {
                    this.out = new File(args[i + 1]);
                }
            }
        }
    }

    public String getMode() {
        return mode;
    }

    public int getKey() {
        return key;
    }

    public String getData() {
        return data;
    }

    public File getOut() {
        return out;
    }
}
