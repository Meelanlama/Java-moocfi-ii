
import java.util.ArrayList;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> Items;

    public Suitcase(int maximumWeight) {
        this.Items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item Item) {
        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            return;
        }

        this.Items.add(Item);
    }

    public int totalWeight() {
//        int summa = 0;
//        int indeksi = 0;
//        while (indeksi < this.Items.size()) {
//        summa += this.Items.get(indeksi).getWeight();
//        indeksi++;
//        }
//        return summa;

        return Items.stream()
                .map(i -> i.getWeight()) //map method to transform each element of stream
                .reduce(0, (previous, current) -> previous + current);  // sums all the weights of the items, 0 is previous value and 
//current value is i.getWeight value
//previous = 0;
//current = w1(i.getWeight);
//result = previous + current; // 0 + w1
//it goes on until all items is weighted
    }

    public void printItems() {
//        int indeksi = 0;
//        while (indeksi < this.Items.size()) {
//            Item t = this.Items.get(indeksi);
//            System.out.println(t);
//            indeksi++;
//        }
        Items.forEach(print -> System.out.println(print));
    }

    public Item heaviestItem() {
        if (this.Items.isEmpty()) {
            return null;
        }

        // Tutustumme järjestämiseen hieman myöhemmin kurssilla
        return this.Items.stream().max((t1, t2) -> t1.getWeight() - t2.getWeight()).get();
    }

    @Override
    public String toString() {
        if (this.Items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.Items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }

        return this.Items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
