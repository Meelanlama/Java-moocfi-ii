
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meelan
 */
public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        int order = c1.getSuit().ordinal() - c2.getSuit().ordinal();

        //if value is same then ordering them by suits using compareTo
        if (order == 0) {
            return c1.compareTo(c2);
        }

        return order;
    }
}
