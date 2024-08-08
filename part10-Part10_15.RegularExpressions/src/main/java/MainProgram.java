
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Scanner scan = new Scanner(System.in);
        Checker test = new Checker();

        while (true) {
            System.out.println("Enter a String:");
//            Calling method and passing parameter from input to check.
            if (test.isDayOfWeek(scan.nextLine())) {
                System.out.println("The form is correct.");
            } else {
                System.out.println("The form is incorrect.");
            }

            if (test.allVowels(scan.nextLine())) {
                System.out.println("The form is correct.");
            } else {
                System.out.println("The form is incorrect.");
            }

            if (test.timeOfDay(scan.nextLine())) {
                System.out.println("The form is correct.");
            } else {
                System.out.println("The form is incorrect.");
            }
        }
    }
}
