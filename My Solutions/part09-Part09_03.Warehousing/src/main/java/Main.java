
public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes
//        ProductWarehouse juice = new ProductWarehouse("Juice",1000.0);
//        juice.addToWarehouse(1000.0);
//        juice.takeFromWarehouse(11.3);
//        System.out.println(juice.getName());
//        juice.addToWarehouse(1.0);
//        System.out.println(juice);

// the usual:
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);           // Juice: balance = 989.7, space left 10.3

// etc
// however, history() still doesn't work properly:
        System.out.println(juice.history()); // [1000.0]
// so we only get the initial state of the history set by the constructor..

        juice.printAnalysis();
    }

}
