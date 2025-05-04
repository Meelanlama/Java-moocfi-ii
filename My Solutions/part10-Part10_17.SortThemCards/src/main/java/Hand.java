
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meelan
 */
public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cardsList;

    public Hand() {
        this.cardsList = new ArrayList<>();
    }

    public void add(Card card) {
        this.cardsList.add(card);
    }

    public void print() {
        for (Card print : cardsList) {
            System.out.println(print);
        }
    }

    public void sort() {
        Collections.sort(cardsList);
    }

    public int sum() {
        int sum = 0;

        for (Card card : this.cardsList) {
            sum += card.getValue();
        }
        return sum;
    }

    @Override
    //comparing sum of the list
    public int compareTo(Hand compare) {
        if (compare.sum() == this.sum()) {
            return 0;
        }
        return this.sum() - compare.sum();
    }

    //sorting cards by their suits
    public void sortBySuit() {
        Collections.sort(cardsList, new BySuitInValueOrder());
    }
}
