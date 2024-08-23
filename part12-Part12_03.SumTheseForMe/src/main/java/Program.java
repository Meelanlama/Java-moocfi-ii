
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));

    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        // Adjust the fromWhere index if it's less than 0
        if (fromWhere < 0) {
            fromWhere = 0;
        }

        // Adjust the toWhere index if it's greater than the array length
        if (toWhere > array.length) {
            toWhere = array.length - 1;
        }

        int sum = 0;
        // Iterate through the specified range in the array
        for (int i = fromWhere; i < toWhere; i++) {
            // Check if the current element is within the specified bounds
            if (array[i] >= smallest && array[i] <= largest) {
                sum += array[i];
            }
        }
        return sum;
    }
}
