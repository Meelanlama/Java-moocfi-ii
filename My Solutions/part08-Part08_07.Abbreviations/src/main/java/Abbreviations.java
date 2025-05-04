
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meelan
 */
public class Abbreviations {

    private HashMap<String, String> hash;

    public Abbreviations() {
        this.hash = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.hash.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.hash.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        if (this.hasAbbreviation(abbreviation)) {
            return this.hash.get(abbreviation);
        }
        return null;
    }
}
