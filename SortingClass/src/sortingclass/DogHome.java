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
public class DogHome implements Comparable {
    
    private Date date;
    private int height;
    private int weight;

    public DogHome(Date date, int height, int weight) {
        this.date = date;
        this.height = height;
        this.weight = weight;
    }
    
    

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Date getDate() {
        return date;
    }

   // @Override
  //  public int compareTo(DogHome o) {
  //      return Integer.compare(height, o.getHeight());
  //  }

    @Override
    public String toString() {
        return "DogHome{" + "date=" + date + ", height=" + height + ", weight=" + weight + '}';
    }
    
    @Override
    public int compareTo(Object o) {
        if (o instanceof Dog) {
            Dog d = (Dog) o;
            return this.date.compareTo(d.getDate());
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
