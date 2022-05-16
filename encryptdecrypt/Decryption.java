package encryptdecrypt;

public class Decryption implements Cryption {

    @Override
    public String executeUnicode(String msg, int shift) {

        for (int i = 0; i < msg.length(); i++) {
            char current = msg.charAt(i);
            sb.append((char) (current - shift));

        }
        return sb.toString();
    }

    @Override
    public String executeShift(String msg, int shift) {

        shift = shift % 25;

        for (int i = 0; i < msg.length(); i++) {
            char current = msg.charAt(i);
            if (Character.isLowerCase(current)) {
                int c = current - shift >= 97 ? current - shift : current - shift + 122 - 96;
                sb.append((char) c);
            } else if (Character.isUpperCase(current)) {
                int c = current - shift >= 65 ? current - shift : current - shift + 90 - 64;
                sb.append((char) c);
            } else {
                sb.append(current);
            }
        }

        return sb.toString();
    }
}
