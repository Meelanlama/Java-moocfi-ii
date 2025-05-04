/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meelan
 */
public class Book implements Packable {

    private String author;
    private String bookName;
    private double weightBook;

    public Book(String author, String bookName, double WeightBook) {
        this.author = author;
        this.bookName = bookName;
        this.weightBook = WeightBook;
    }

    public double weight() {
        return this.weightBook;
    }
    
      public String toString() {
        return  author + ": " + bookName;
    }
}
