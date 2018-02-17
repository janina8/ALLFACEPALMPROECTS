/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Cube
 */
public class Person extends Human{
    
    private Adress adress;
    private long id;

    public Adress getAdress() {
        return adress;
    }

    public long getId() {
        return id;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Person(Adress adress, long id, String name, String country, String gender) {
        super(name, country, gender);
        this.adress = adress;
        this.id = id;
    }
    
    public String toString(){
        return id+"";
    }
    
}
