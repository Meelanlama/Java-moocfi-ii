
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
public class Pipe<T> {

    private ArrayList<T> data;

    public Pipe() {
        this.data = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.data.add(value);
    }

    //removing data which is oldest so its in index 0
    public T takeFromPipe() {
        if (data.isEmpty()) {
            return null;
        }
        T firstData = data.get(0);
        data.remove(0);
        return firstData;
    }

    public boolean isInPipe() {
        if (data.isEmpty()) {
            return false;
        }
        return true;
    }
}
