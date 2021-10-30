package ro.ase.ism.sap.deepcopy;

import java.util.Date;

public class TestDeepVsShallow {

    public static String getHex(byte[] array) {
        String output = "";
        for (byte value : array) {
            output += String.format("%02x", value);
        }
        return output;
    }

    public static class Certificate {
        String owner;
        byte[] publicKey;
        Date expirationDate;

        public Certificate(String owner, byte[] publicKey, Date expirationDate) {
            this.owner = owner;
            this.publicKey = publicKey;
            this.expirationDate = expirationDate;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\n Owner: " + this.owner);
            stringBuilder.append("\n Public Key: " + getHex(this.publicKey));
            stringBuilder.append("\n Public Key: " + this.expirationDate);
            return stringBuilder.toString();
        }
    }

    public static void main(String[] args) {
        byte[] publicKey = {1 << 3, 1 << 6, 1 << 4, 1};
        Certificate ismCertificate = new Certificate("ism.ase.ro", publicKey, new Date());
        System.out.println(ismCertificate);
        publicKey[1] = (byte) 0xFF;
        System.out.println(ismCertificate);
    }
}
