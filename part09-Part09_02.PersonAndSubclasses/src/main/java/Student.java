/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meelan
 */
public class Student extends Person {

    public Student(String name, String address) {
        super(name, address);
    }

    private int credit = 0;

    public int credits() {
        return credit;
    }

    public void study() {
        credit += 1;
    }

    public String toString() {
        return super.toString() + "\n " + " Study credits " + this.credit;
    }
}
