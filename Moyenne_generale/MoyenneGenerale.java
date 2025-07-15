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
        int size;
        do{
            while (!scan.hasNextInt()) { // check if input is an Integer. When not the User will retry 
                System.out.println("\nIt is not a number. Retry");
                scan.next();
                System.out.print("Number of Subjects: ");
            }
            size = scan.nextInt();
            if (size < 1) { // check if the size is less than 1. When not the User will retry.
                System.out.println("\nThe number of Subjects must be at least 1. Retry");
                //scan.next();
                System.out.print("Number of Subjects: ");
            }
        }while (size < 1);
        scan.nextLine();
        System.out.println();

        subject = new String[size];
        marks = new float[size];
        coefs =  new float[size];

        System.out.println("\n\nPreparing to enter the Datas ...");
        System.out.println("--------------------------------------------------");
        // Filling the arrays with user input
        for (int i = 0; i < size; i++) {
            System.out.print("Name of the subject: ");
            subject[i] = scan.nextLine();

            System.out.print("Mark: ");
            do{
                while (!scan.hasNextFloat()) { // check if input is a Float. When not the User will retry 
                    System.out.println("\nIt is not a number. Retry");
                    scan.next();
                    System.out.print("Mark: ");
                }
                marks[i] = scan.nextFloat();
                if (marks[i] < 0.25 || marks[i] > 20) {
                    System.out.println("\nThe Mark should be between 0.25 and 20.");
                    //scan.next();
                    System.out.print("Mark: ");
                }
            }while(marks[i] < 0.25 || marks[i] > 20);
            

            System.out.print("Coefficient: ");
            do {
                while (!scan.hasNextFloat()) { // check if input is a Float. When not the User will retry 
                    System.out.println("\nIt is not a number. Retry");
                    scan.next();
                    System.out.print("Coefficient: ");
                }
                coefs[i] = scan.nextFloat();
                if (coefs[i] <= 0) { // check if the Coefficient is greather than 0
                    System.out.println("\nThe Coefficient must be greather than 0");
                    //scan.next();
                    System.out.print("Coefficient: ");
                }
            } while (coefs[i] <= 0);
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
