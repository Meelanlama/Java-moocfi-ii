/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meelan
 */
public class Organism implements Movable {

    //xCoord (or xCoordinate) typically represents the x-coordinate in a 2D coordinate system
    private int x;
    private int y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) {
    this.x += dx;
    this.y += dy;
    }

    public String toString() {
        return "x: " + this.x + "; y: " + this.y;
    }
}
