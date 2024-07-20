
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meelan
 */
public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    //Method to get the currentweight of the list
    public int CurrentCapacity() {
        int weight = 0;
        for (Item value : this.items) {
            weight += value.getWeight();
        }
        return weight;
    }

    public void add(Item item) {
        //if the capacity is lower then only add
        if (CurrentCapacity() + item.getWeight() <= capacity) {
            this.items.add(item);
        }
    }

    //Must override the abstract superclass abstract methods in subclass
    public boolean isInBox(Item item) {
        //checking if the list conatins the item
        return this.items.contains(item);
    }
}
