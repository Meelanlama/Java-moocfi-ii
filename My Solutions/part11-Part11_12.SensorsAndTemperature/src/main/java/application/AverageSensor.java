/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Meelan
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> lists;
    private ArrayList<Integer> readings;

    public AverageSensor() {
        this.lists = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : this.lists) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : this.lists) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : this.lists) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (!isOn() || this.lists.isEmpty()) {
            throw new IllegalStateException();
        }
        int sum = 0;
        int count = 0;
        for (Sensor sensor : this.lists) {
            int value = sensor.read();
            sum += value;
            count++;
        }
        this.readings.add(sum / count);
        return (sum / count);
    }

    public void addSensor(Sensor toAdd) {
        this.lists.add(toAdd);
    }

    public List<Integer> readings() {
        return this.readings;
    }
}
