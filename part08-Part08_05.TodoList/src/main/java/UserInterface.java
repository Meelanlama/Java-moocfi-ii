
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meelan
 */
public class UserInterface {

    private TodoList list;
    private Scanner scan;

    public UserInterface(TodoList lists, Scanner scan) {
        this.list = lists;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scan.nextLine();
            if (input.equals("stop")) {
                break;
            }
            if (input.equals("add")) {
                System.out.println("To add:");
                String addWork = scan.nextLine();
                this.list.add(addWork);
                continue;
            }
            if (input.equals("list")) {
                this.list.print();
                continue;
            }
            if (input.equals("remove")) {
                System.out.println("Which one is removed?");
                int removeNum = scan.nextInt();
                this.list.remove(removeNum);
                continue;
            }
        }
    }
}
