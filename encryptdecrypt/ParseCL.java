package encryptdecrypt;

import encryptdecrypt.IOfiles.ReadFile;

import java.io.File;

public class ParseCL {

    private String mode;
    private int key;
    private String data;
    private File in;
    private File out;
    private String alg;

    public ParseCL() {
        this.mode = "enc";
        this.key = 0;
        this.data = "";
        this.alg = "shift";
    }

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
                } else if ("-alg".equalsIgnoreCase(args[i])) {
                    this.alg = args[i + 1];
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

    public String getAlg() {
        return alg;
    }

    public File getIn() {
        return in;
    }
}
