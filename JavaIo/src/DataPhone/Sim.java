/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPhone;

import java.io.Serializable;

/**
 *
 * @author Cube
 */
public class Sim implements Serializable{

    private int number;
    private int sum;
    private String provider;

    public String connect(String calledNumber) {

        return "Соединяемся..." + provider + calledNumber;

    }

    public String disConnect() {

        return "Обонент отключился";

    }

    public Sim(int number, int sum, String provider) {
        this.number = number;
        this.sum = sum;
        this.provider = provider;
    }

    public int getNumber() {
        return number;
    }

    public int getSum() {
        return sum;
    }

    public String getProvider() {
        return provider;
    }

    @Override
    public String toString() {
        return "Sim{" + "number=" + number + ", sum=" + sum + ", provider=" + provider + '}';
    }

}
