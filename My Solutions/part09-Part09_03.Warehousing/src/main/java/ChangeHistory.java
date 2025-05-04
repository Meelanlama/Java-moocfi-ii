
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
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double maxValue = this.history.get(0);
        for (Double print : history) {
            if (print >= maxValue) {
                maxValue = print;
            }
        }
        return maxValue;
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double minValue = this.history.get(0);
        for (Double print : history) {
            if (print <= minValue) {
                minValue = print;
            }
        }
        return minValue;
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Double print : history) {
            sum += print;

        }
        return sum / this.history.size();
    }

    public String toString() {
        return this.history.toString();
    }
}
