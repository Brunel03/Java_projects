import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Arrays;

public class GenerateNumbersAndStrings {
    public static void main(String[] args) {
        String up = generateString2(10,false);
        System.out.println(up);

        var hi = generateNumber(6);
        System.out.println(hi);

        var matricule = String.join("-", generateString(2,true), generateNumber(4));
        System.out.printf("%s\n",matricule);

        randomChoice(false, "Douala", "Washington DC", "Berlin", "Londres", "Münich");
        System.out.println();
        randomChoice(true, "Douala", "Washington DC", "Berlin", "Londres", "Münich");
    }

    public static String generateString( int size, boolean uppercase) {
        StringBuilder sb = new StringBuilder();

        if (size <= 0) {
            System.out.println("The size must be greather than 0");
        }

        for (int i = 0; i < size; i++){
            char letter = (char) ('a' + ThreadLocalRandom.current().nextInt(26));
            sb.append(letter);
        }
        String string = sb.toString();

        if (uppercase) {
            return string.toUpperCase();
        }
        return string;
    }

    public static String generateString2( int size, boolean capitalize) {
        StringBuilder sb = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        if (size <= 0) {
            System.out.println("The size must be greather than 0");
        }

        for (int i = 0; i < size; i++) {
            var index = ThreadLocalRandom.current().nextInt(alphabet.length());
            sb.append(alphabet.charAt(index));
        }
        String string = sb.toString();

        if (capitalize){
            return string.toUpperCase();
        }
        return string;
    }

    public static String generateNumber( int size) {
        StringBuilder sb = new StringBuilder();

        if (size <= 0) {
            System.out.println("The size must be greather than 0");
        }

        for (int i = 0; i < size; i++) {
            var digit = ThreadLocalRandom.current().nextInt(10);
            sb.append(digit);
        }
        String number = sb.toString(); 
        return number;
    }

    public static void randomChoice(boolean iterate, String... items) {
        ArrayList<String> itemList = new ArrayList<>(Arrays.asList(items));

        if (itemList.isEmpty()) {
            System.out.println("No Element entered.");
            return;
        }

        if (iterate) {
            while (!itemList.isEmpty()) {
                int index = ThreadLocalRandom.current().nextInt(itemList.size());
                String item = itemList.remove(index);
                System.out.println(item);
            }
        } else {
            int index = ThreadLocalRandom.current().nextInt(itemList.size());
            System.out.println(itemList.get(index));
        }
    }
}
