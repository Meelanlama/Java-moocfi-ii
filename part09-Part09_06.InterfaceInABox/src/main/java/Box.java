
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
public class Box implements Packable {

    private double maximumWeight;
    private ArrayList<Packable> boxList;

    public Box(double maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.boxList = new ArrayList<>();
    }

    public double weight() {
        double currentWeight = 0;
        for (Packable list : boxList) {
            currentWeight += list.weight();
        }
        return currentWeight;
    }

    public void add(Packable packages) {
        if (weight() + packages.weight() <= this.maximumWeight) {
            this.boxList.add(packages);
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.boxList.size() + " items, total weight " + weight() + " kg";
    }

}
