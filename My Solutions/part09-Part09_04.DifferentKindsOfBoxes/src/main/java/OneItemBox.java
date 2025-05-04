
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
public class OneItemBox extends Box {

    private ArrayList<Item> oneItem;

    public OneItemBox() {
        this.oneItem = new ArrayList<>();
    }

    public void add(Item item) {
        if (oneItem.isEmpty()) {
            this.oneItem.add(item);
        }
    }

    public boolean isInBox(Item item) {
        return this.oneItem.contains(item);
    }
}
