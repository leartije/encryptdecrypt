package encryptdecrypt;

public class Context {

    private final Cryption cryption;

    public Context(Cryption cryption) {
        this.cryption = cryption;
    }

    public String execute(String msg, int key, String alg) {
        if (this.cryption instanceof Encryption) {
            if ("shift".equalsIgnoreCase(alg)) {
                return this.cryption.executeShift(msg, key);
            }
            return this.cryption.executeUnicode(msg, key);
        } else if (this.cryption instanceof Decryption) {
            if ("shift".equalsIgnoreCase(alg)) {
                return this.cryption.executeShift(msg, key);
            }
            return this.cryption.executeUnicode(msg, key);
        }

        return "-1";
    }

}
