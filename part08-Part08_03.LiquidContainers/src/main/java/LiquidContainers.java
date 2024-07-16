
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First:" + firstContainer + "/100");
            System.out.println("Second:" + secondContainer + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            //Splitting string
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (firstContainer + amount > 100) {
                    firstContainer = 100;
                } else if (amount > 0) {
                    firstContainer += amount;
                }
            }

            if (command.equals("move")) {
                if(amount > firstContainer){
                secondContainer += firstContainer;
                firstContainer -= firstContainer;
                } else if (secondContainer + amount > 100) {
                    secondContainer = 100;
                    firstContainer -= firstContainer;
                } else if (amount > 0) {
                    firstContainer -= amount;
                    secondContainer += amount;
                }
            }

            if (command.equals("remove")) {
                if (amount > secondContainer) {
                    secondContainer -= secondContainer;
                } else if (amount > 0) {
                    secondContainer -= amount;
                }
            }
        }
    }
}
