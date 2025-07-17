import java.util.Random;

public class GenerateNumbersAndStrings {
    public static void main(String[] args) {
        String up = generateString2(10, true);
        System.out.println(up);

        var hi = generateNumber(6);
        System.out.println(hi);

        var matricule = generateString(2,true) +'-'+generateNumber(4);
        System.out.println(matricule);
    }

    public static String generateString( int size, boolean uppercase) {
        Random random = new Random();
        String string = "";

        if (size <= 0) {
            System.out.println("The size must be greather than 0");
        }

        for (int i = 0; i < size; i++){
            char letter = (char) ('a' + random.nextInt(26));
            string += Character.toString( letter);
        }

        if (uppercase) {
            return string.toUpperCase();
        }
        return string;
    }

    public static String generateString2( int size, boolean capitalize) {
        Random random = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz", string = "";

        if (size <= 0) {
            System.out.println("The size must be greather than 0");
        }

        for (int i = 0; i < size; i++) {
            int index = random.nextInt(alphabet.length());
            string += alphabet.charAt(index);
        }

        if (capitalize){
            return string.toUpperCase();
        }
        return string;
    }

    public static String generateNumber( int size) {
        Random random = new Random();
        String number = "";

        if (size <= 0) {
            System.out.println("The size must be greather than 0");
        }

        for (int i = 0; i < size; i++) {
            byte digit = (byte) (random.nextInt(10));
            number += Byte.toString(digit);
        }
        return number;
    }
}
