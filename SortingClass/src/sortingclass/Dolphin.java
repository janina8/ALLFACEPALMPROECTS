/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingclass;

import java.util.Date;

/**
 *
 * @author Cube
 */
public class Dolphin implements Comparable {

    private String name;
    private Date date;
    private int height;
    private int weight;

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Dolphin(String name, Date date, int height, int weight) {
        this.name = name;
        this.date = date;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dolphin{" + "name=" + name + ", date=" + date + ", height=" + height + ", weight=" + weight + '}';
    }

    
    
    @Override
    public int compareTo(Object o) {
        if (o instanceof Dolphin) {
            Dolphin d = (Dolphin) o;
            return this.date.compareTo(d.getDate());
        }
        if (o instanceof DogHome) {
            DogHome a = (DogHome) o;
            return this.date.compareTo(a.getDate());
        }
        if (o instanceof Dog) {
            Dog a = (Dog) o;
            return this.date.compareTo(a.getDate());
        } else {
            return 0;
        }

    }

}
