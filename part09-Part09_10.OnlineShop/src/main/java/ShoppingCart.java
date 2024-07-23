
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meelan
 */
public class ShoppingCart {

    private Map<String, Item> cartItems;

    public ShoppingCart() {
        this.cartItems = new HashMap<>();
    }

    public void add(String product, int price) {
        //if product  is present then adding the product again wont change price
        this.cartItems.putIfAbsent(product, new Item(product, 0, price));
        this.cartItems.get(product).increaseQuantity();
    }

    public int price() {
        int total = 0;
        for (Item items : cartItems.values()) {
            total += items.price();
        }
        return total;
    }

    public void print() {
        for (Item cart : cartItems.values()) {
            System.out.println(cart);
        }
    }
}
