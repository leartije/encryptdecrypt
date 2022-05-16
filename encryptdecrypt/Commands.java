package encryptdecrypt;

public enum Commands {

    MODE("-mode"),
    KEY("-key"),
    ALG("-alg"),
    DATA("-data"),
    IN("-in"),
    OUT("-out");


    private String name;

    Commands(String name) {
        this.name = name;
    }


}
