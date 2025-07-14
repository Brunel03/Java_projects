import java.util.Scanner;
import java.util.Locale;

public class MoyenneGenerale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        String[]subject;
        float[] marks, coefs;
        float sum = 0, totalCoef = 0, average;

        System.out.print("Number of Subjects: ");
        int size = scan.nextInt();
        scan.nextLine();
        System.out.println();

        subject = new String[size];
        marks = new float[size];
        coefs =  new float[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Name of the subject: ");
            subject[i] = scan.nextLine();

            System.out.print("Mark: ");
            marks[i] = scan.nextFloat();

            System.out.print("Coefficient: ");
            coefs[i] = scan.nextFloat();
            scan.nextLine();

            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            sum += marks[i] * coefs[i];
            totalCoef += coefs[i];
        }

        average = sum / totalCoef;
        
        for (int i = 0; i < size; i++) {
            System.out.printf("%s\t%.2f\t%.2f\n", subject[i],marks[i],coefs[i]);
        }
        System.out.printf("\nAverage: %.2f", average);
        
        scan.close();


    }
}
