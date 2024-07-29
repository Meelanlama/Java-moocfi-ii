
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter negative number to stop");
        while (true) {
            int input = scanner.nextInt();
            if (input < 0) {
                break;
            }
            numbers.add(input);
        }

        numbers.stream()
                .filter(num -> num <= 5)
                .forEach(print -> System.out.println(print));
    }
}
