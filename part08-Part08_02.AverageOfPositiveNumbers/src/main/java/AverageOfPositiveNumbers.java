
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0, sum = 0, number;
        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number > 0) {
                count++;
                sum += number;
            }
        } // While loop end
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        }
        double avg = 1.0 * sum / count;
        System.out.println(avg);
    }
}
