
import java.util.ArrayList;
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
public class DictionaryOfManyTranslations {

    //Using arraylist in value to store more than one data for key
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        //putIfAbsent is if dictionary hashmap doesnot contains that key already than add the key
        this.dictionary.putIfAbsent(word, new ArrayList<>());

        //if the data is not in list then only added
        if (!this.dictionary.get(word).contains(translation)) {
            this.dictionary.get(word).add(translation);
        }
    }

    public ArrayList<String> translate(String word) {
        if (this.dictionary.containsKey(word)) {
           return this.dictionary.get(word);
        }
        // return null list if word not found
        return new ArrayList<>();
    }

    public void remove(String word) {
        this.dictionary.remove(word);
    }
}
