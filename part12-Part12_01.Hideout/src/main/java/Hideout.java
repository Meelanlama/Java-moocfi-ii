/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meelan
 */
public class Hideout<T> {

    private T hidden;

    // Method to put an object into the hideout
    public void putIntoHideout(T toHide) {
        // The new object replaces the current hidden object
        this.hidden = toHide;
    }

    // Method to retrieve the hidden object 
    public T takeFromHideout() {
        return hidden;
    }

    //returns true if hideout is empty otherwise false
    public boolean isInHideout() {
        if (hidden == null) {
            return false;
        } else {
            return true;
        }
    }
}
