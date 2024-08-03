
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation:");
            int age = scanner.nextInt();
            scanner.nextLine();
            books.add(new Book(name, age));
        }
        
        if (books.size() > 1) {
            System.out.println(books.size() + " books in total.");
        } else {
            System.out.println(books.size() + " book in total.");
        }
        System.out.println("");
        System.out.println("Books:");
        
        Comparator<Book> comparator = Comparator
                //short form of lambda, book -> book.getAge()
                .comparing(Book::getAge)
                //chaining comparison if its of same age then sorting alphabetically
                .thenComparing(Book::getName);
        
        //sorts by age then by name using comparator
        Collections.sort(books, comparator);

        for (Book e : books) {
            System.out.println(e.toString());
        }
    }
}
