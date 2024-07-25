
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meelan
 */
public class Herd implements Movable {

    private List<Movable> list;

    public Herd() {
        this.list = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }

    public void move(int dx, int dy) {
        for(Movable herds : this.list){
        herds.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String herds = "";
        for (Movable print : this.list){
           herds =  herds + print.toString() + "\n";
        }
        return herds;
    }
}
