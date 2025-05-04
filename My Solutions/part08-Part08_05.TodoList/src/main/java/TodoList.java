
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meelan
 */
public class TodoList {

    private ArrayList<String> work;

    public TodoList() {
        this.work = new ArrayList<>();
    }

    public void add(String task) {
        this.work.add(task);
    }

    public void print() {
        for (int i = 0; i <= work.size() - 1; i++) {
            System.out.println(i + 1 + ": " + work.get(i));
        }
    }

    public void remove(int number) {
        if (number >= 0 && number < work.size()) {
            this.work.remove(number - 1);
        }
    }
}
