
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Random rdm = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            int randomNum = rdm.nextInt(11);
            System.out.println(randomNum);
        }
    }
}
