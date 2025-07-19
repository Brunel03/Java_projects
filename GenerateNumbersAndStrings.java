import java.util.concurrent.ThreadLocalRandom;

public class GenerateNumbersAndStrings {
    public static void main(String[] args) {
        String up = generateString2(10, true);
        System.out.println(up);

        var hi = generateNumber(6);
        System.out.println(hi);

        var matricule = String.join("_", generateString(2,true), generateNumber(4));
        System.out.println(matricule);
    }

    public static String generateString( int size, boolean uppercase) {
        String string = "";

        if (size <= 0) {
            System.out.println("The size must be greather than 0");
        }

        for (int i = 0; i < size; i++){
            char letter = (char) ('a' + ThreadLocalRandom.current().nextInt(26));
            string += Character.toString( letter);
        }

        if (uppercase) {
            return string.toUpperCase();
        }
        return string;
    }

    public static String generateString2( int size, boolean capitalize) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz", string = "";

        if (size <= 0) {
            System.out.println("The size must be greather than 0");
        }

        for (int i = 0; i < size; i++) {
            int index = ThreadLocalRandom.current().nextInt(alphabet.length());
            string += alphabet.charAt(index);
        }

        if (capitalize){
            return string.toUpperCase();
        }
        return string;
    }

    public static String generateNumber( int size) {
        String number = "";

        if (size <= 0) {
            System.out.println("The size must be greather than 0");
        }

        for (int i = 0; i < size; i++) {
            byte digit = (byte) (ThreadLocalRandom.current().nextInt(10));
            number += Byte.toString(digit);
        }
        return number;
    }
}
