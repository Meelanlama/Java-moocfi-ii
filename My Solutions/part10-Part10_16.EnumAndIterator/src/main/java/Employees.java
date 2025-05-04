
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meelan
 */
public class Employees {

    private ArrayList<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    //adding the list 
    public void add(List<Person> peopleToAdd) {
        if (peopleToAdd != null && !peopleToAdd.isEmpty()) {
            this.employees.addAll(peopleToAdd);
        }
    }

    //printing using iterator
    public void print() {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person print = iterator.next();
            System.out.println(print);
        }
    }

    //printing if education match
    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                print();
            }
        }
    }

    //removing the employee if education matches
    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
