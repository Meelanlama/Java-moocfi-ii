
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meelan
 */
public class Warehouse {

    //map for storing prices and stock of products
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        if (!prices.containsKey(product)) {
            return -99;
        }
        return prices.get(product);
    }

    public int stock(String product) {
        if (!stocks.containsKey(product)) {
            return 0;
        }
        return stocks.get(product);
    }

    public boolean take(String product) {
        //if product is not in the list and product stock is less than 0, return false;
        if (!this.stocks.containsKey(product) || this.stocks.get(product) <= 0) {
            return false;
        }

        // if stock is > 0 than reduce stock by 1;
        this.stocks.put(product, stocks.get(product) - 1);
        return true;

        // this code also correct
//        if (stocks.containsKey(product)) {
//            if (stocks.get(product) > 0) {
//               this.stocks.put(product, stocks.get(product)-1);
//            }
//            return true;
//        } else {
//            return false;
//        }
    }
    
    public Set<String> products(){
    return prices.keySet();
    }
}
