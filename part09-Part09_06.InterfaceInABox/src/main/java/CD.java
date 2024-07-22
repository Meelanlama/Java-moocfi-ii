/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meelan
 */
public class CD implements Packable {

    private String aristName;
    private String cdName;
    private int publicationYear;
    private double weight;

    public CD(String aristName, String cdName, int publicationYear) {
        this.aristName = aristName;
        this.cdName = cdName;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }

    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return  aristName + ": " + cdName + " (" + publicationYear + ")";
    }
}
