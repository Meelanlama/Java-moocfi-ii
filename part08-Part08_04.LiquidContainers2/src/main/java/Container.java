/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meelan
 */
public class Container {

    private int container;

    public Container() {
        this.container = container;
    }

    public int contains() {
        return this.container;
    }

    public void add(int amount) {
        if (amount + this.container > 100) {
            this.container = 100;
        } else if (amount > 0) {
            this.container += amount;
        }
    }

    public void remove(int amount) {
        if (amount >= this.container) {
            this.container = 0;
        } else if (amount > 0) {
            this.container -= amount;
        }
    }

    public String toString() {
        return contains() + "/100";
    }
}
