
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-8);
        numbers.add(-11);
        numbers.add(-3);
        numbers.add(1);
        numbers.add(8);
        numbers.add(1);
//        System.out.println(numbers);
        positive(numbers);
    }

    public static List<Integer> positive(List<Integer> list) {
        ArrayList<Integer> values = list.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(values);
        return values;
    }
}
