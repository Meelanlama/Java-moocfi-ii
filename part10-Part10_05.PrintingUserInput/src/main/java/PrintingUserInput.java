
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        System.out.println("Enter strings, Press enter without typing to stop");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()){
                break;
            }
            list.add(input);
        }
        for (String print : list) {
            System.out.println(print);
        }
    }
}
