
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
//        Person milan = new Person("Milan", Education.BA);
//        System.out.println(milan);

        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));

        university.print();

        university.fire(Education.HS);

        System.out.println("==");

        university.print();
    }
}
