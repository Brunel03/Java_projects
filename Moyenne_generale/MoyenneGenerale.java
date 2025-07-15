import java.util.Scanner;
import java.util.Locale;

public class MoyenneGenerale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        // Initializing The Variables
        String[]subject;
        float[] marks, coefs;
        float sum = 0, totalCoef = 0, average;

        // Setting the size of the arrays       
        System.out.print("Number of Subjects: ");
        while (!scan.hasNextInt()) { // check if input is an Integer. When not the User will retry 
            System.out.println("\nIt is not a number. Retry");
            scan.next();
            System.out.print("\nNumber of Subjects: ");
        }
        int size = scan.nextInt();
        scan.nextLine();
        System.out.println();

        subject = new String[size];
        marks = new float[size];
        coefs =  new float[size];

        // Filling the arrays with user input
        for (int i = 0; i < size; i++) {
            System.out.print("Name of the subject: ");
            subject[i] = scan.nextLine();

            System.out.print("Mark: ");
            while (!scan.hasNextFloat()) { // check if input is a Float. When not the User will retry 
                System.out.println("\nIt is not a number. Retry");
                scan.next();
                System.out.print("\nMark: ");
            }
            marks[i] = scan.nextFloat();

            System.out.print("Coefficient: ");
            while (!scan.hasNextFloat()) { // check if input is a Float. When not the User will retry 
                System.out.println("\nIt is not a number. Retry");
                scan.next();
                System.out.print("\nCoefficient: ");
            }
            coefs[i] = scan.nextFloat();
            scan.nextLine();

            System.out.println();
        }

        // Calculating the average  
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
