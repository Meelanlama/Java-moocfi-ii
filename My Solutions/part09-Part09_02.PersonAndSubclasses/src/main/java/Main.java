
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here

        //Person - Part 1
//        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
//        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
//
//        System.out.println(ada);
//        System.out.println(esko);
//
//        //part 2
//        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//        System.out.println(ollie);
//        // System.out.println("Study credits " + ollie.credits());
//        ollie.study();
////        System.out.println("Study credits " + ollie.credits());
//        System.out.println(ollie);
//    }
        //part 4;
//        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
//        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
//        System.out.println(ada);
//        System.out.println(esko);
//
//        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//
//        int i = 0;
//        while (i < 25) {
//            ollie.study();
//            i++;
//        }
//        System.out.println(ollie);
// Part 5
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);

    }

    public static void printPersons(ArrayList<Person> persons) {
            for(Person print: persons){
                System.out.println(print);
            }
    }
}
