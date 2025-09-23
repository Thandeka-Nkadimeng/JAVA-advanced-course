/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7.Encapsulation;

/**
 *
 * @author Thandeka Nkadimeng
 */
public class Kettle {

    private boolean waterBoiling = false;
    private boolean heatSensorOn = false;

    public void switchOn() {
        if (isThereWater()) {
            System.err.println("Switching on...");
            accessElectricity();
            heatUpSensor();

            if (isWtaterBoiling()) {
                waterBoiling = true;
                switchOff();
            } else {
                switchOff();
                putWater();
            }
        }
    }

    public void switchOff() {
        System.err.println("Switching off...");
    }

    public void putWater() {
    }

    public void heatUpSensor() {
        System.err.println("Sensor heating up...");
        heatSensorOn = true;
    }

    private void accessElectricity() {
        System.err.println("Using electricity...");
    }

    private boolean isThereWater() {
        return false;
    }

    private boolean isWtaterBoiling() {
        return false;
    }
}
