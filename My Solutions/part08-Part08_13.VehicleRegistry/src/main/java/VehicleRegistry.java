
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
public class VehicleRegistry {

    //Instance variable
    private HashMap<LicensePlate, String> register;

    public VehicleRegistry() {
        this.register = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        //if licenseplate is empty, then adding details to hashmap
        if (register.get(licensePlate) == null) {
            register.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        if (!register.containsKey(licensePlate)) {
            return null;
        }
        return register.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!register.containsKey(licensePlate)) {
            return false;
        }

        register.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        //printing all  license plates using keyset as its value is in key
        for (LicensePlate printLicense : this.register.keySet()) {
            System.out.println(printLicense);
        }
    }

    public void printOwners() {
        // creating arraylist to remember owner and print only one time
        ArrayList<String> existingOwners = new ArrayList<>();

        for (LicensePlate license : this.register.keySet()) {
            //getting name of owner 
            String owner = this.register.get(license);

            //if owner is not in the list, then its added.
            if (!existingOwners.contains(owner)) {
                existingOwners.add(owner);
            }
        }
        //printing owner from the list
        for (String printOwner : existingOwners) {
            System.out.println(printOwner);
        }
    }
}
