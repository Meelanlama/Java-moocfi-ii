/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Meelan
 */
public class TemperatureSensor implements Sensor {

    private int value;

    public TemperatureSensor() {
        this.value = 0;
    }

    @Override
    public boolean isOn() {
        if (this.value == 1) {
            return true;
        }
        return false;
    }

    @Override
    public void setOn() {
        this.value = 1;
    }

    @Override
    public void setOff() {
        this.value = 0;
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException("Error");
        } else {
            Random rdm = new Random();
            int randomNumber = rdm.nextInt(61) - 30; // generates random number in range -30 to 30
            return randomNumber;
        }
    }
}
