
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
public class StorageFacility {

    //arraylist for value to store more than one value for key
    private HashMap<String, ArrayList<String>> store;

    public StorageFacility() {
        this.store = new HashMap<>();
    }

    public void add(String unit, String item) {
        // an empty list has to be added for a new unit if one has not already been added
        this.store.putIfAbsent(unit, new ArrayList<>());

//    if (!this.store.get(unit).contains(item)) {
        this.store.get(unit).add(item);
        // }
    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.store.containsKey(storageUnit)) {
            return this.store.get(storageUnit);
        }
        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item) {
        //checking if storageunit exists
//        if (this.store.containsKey(storageUnit)) {
//            //getting the list of unit
//            ArrayList<String> items = this.store.get(storageUnit);
//            //removing one item at time
//            items.remove(item);
//            //If storage unit is empty after all removal than remove unit
//            if (items.isEmpty()) {
//                this.store.remove(storageUnit);
//            }
        //   }

        this.store.get(storageUnit).remove(item);
        if (this.store.get(storageUnit).isEmpty()) {
            this.store.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        //creating list to store unit name
        ArrayList unit = new ArrayList<>();

        //for each loop to iterate over all keynames
        for (String name : this.store.keySet()) {
            //adding name to the list
            unit.add(name);
        }
        return unit;
    }
}
