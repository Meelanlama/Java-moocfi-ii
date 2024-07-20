
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
public class MisplacingBox extends Box {

    private ArrayList<Item> misplaceBox;

    public MisplacingBox() {
        this.misplaceBox = new ArrayList<>();
    }

    //can add any items in list but should return false when searching
    public void add(Item item) {
        this.misplaceBox.add(item);
    }

    public boolean isInBox(Item item) {
        return false;
    }
}
