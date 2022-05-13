package encryptdecrypt;

public class Decryption implements Cryption {

    @Override
    public String execute(String msg, int shift) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < msg.length(); i++) {
            char current = msg.charAt(i);
            sb.append((char) (current - shift));

        }
        return sb.toString();
    }
}
