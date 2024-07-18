
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container first = new Container();
        Container second = new Container();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("First:" + first.contains() + "/100");
            System.out.println("");
            System.out.println("Second:" + second.contains() + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            }

            if (command.equals("move") && amount > 0) {
                if (amount > first.contains()) {
                    second.add(first.contains());
                    first.remove(amount);
                } else if (amount + second.contains() > 100) {
                    second.add(100);
                    first.remove(amount);
                } else {
                    first.remove(amount);
                    second.add(amount);
                }
            }
            if (command.equals("remove")) {
                second.remove(amount);
            }
        }
    }
}
