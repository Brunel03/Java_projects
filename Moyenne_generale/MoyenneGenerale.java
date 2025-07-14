import java.util.Scanner;
import java.util.Locale;

public class MoyenneGenerale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        String[]subject;
        float[] notes, coef;

        System.out.print("Enter the size of your Tables: ");
        int size = scan.nextInt();
        scan.nextLine();
        System.out.println();

        subject = new String[size];
        notes = new float[size];
        coef =  new float[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter a subject: ");
            subject[i] = scan.nextLine();

            System.out.print("Enter a number: ");
            notes[i] = scan.nextFloat();

            System.out.print("Enter another number: ");
            coef[i] = scan.nextFloat();
            scan.nextLine();
            
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            System.out.printf("%s\t%.2f\t%.2f\n", subject[i],notes[i],coef[i]);
            System.out.println();
        }

        scan.close();


    }
}
