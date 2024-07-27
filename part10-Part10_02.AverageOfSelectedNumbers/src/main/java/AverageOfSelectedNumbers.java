
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        // toteuta ohjelmasi tänne
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            inputs.add(row);
        }
        double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        double positiveAverage = inputs.stream()
                .mapToInt(p -> Integer.valueOf(p))
                .filter(number -> number >= 0)
                .average()
                .getAsDouble();

        double negativeAverage = inputs.stream()
                .mapToInt(n -> Integer.valueOf(n))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();

        String userInput = scanner.nextLine();
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        if (userInput.equals("n")) {
            System.out.println("Average of the negative numbers: " + negativeAverage);
        } else {
            System.out.println("Average of the positive numbers: " + positiveAverage);
        }
    }
}
