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
public class Dog implements Comparable{
    private String name;
    private Date date;
    private int height;
    private int weight;

    public Dog(String name, Date date, int height, int weight) {
        this.name = name;
        this.date = date;
        this.height = height;
        this.weight = weight;
    }

    
    
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

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", date=" + date + ", height=" + height + ", weight=" + weight + '}';
    }
    
    

     @Override
    public int compareTo(Object o) {
        if (o instanceof Dog) {
            Dog d = (Dog) o;
            return this.name.compareTo(d.getName());
        }
        if (o instanceof DogHome) {
            DogHome a = (DogHome) o;
            return this.date.compareTo(a.getDate());
        }
        if (o instanceof Dolphin) {
            Dolphin a = (Dolphin) o;
            return this.date.compareTo(a.getDate());
        } else {
            return 0;
        }

    }

    
}
