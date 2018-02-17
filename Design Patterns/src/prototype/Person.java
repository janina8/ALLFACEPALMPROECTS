/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Cube
 */
public class Person implements Prototype{
    
    private String name;
    private int age;
    private DNA dna;
    private Adress adress;
    private int salary;

    public Person(String name, int age, DNA dna, Adress adress, int salary) {
        this.name = name;
        this.age = age;
        this.dna = dna;
        this.adress = adress;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDna(int cromosom) {
        this.dna.setHromasome(cromosom);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public DNA getDna() {
        return dna;
    }

    public Adress getAdress() {
        return adress;
    }

    public int getSalary() {
        return salary;
    }

    public void setAdress(String city,  String street, int zip) {
        this.adress.setCity(city);
        this.adress.setStreet(street);
        this.adress.setZip(zip);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", \ndna=" + dna + ", \nadress=" + adress + ", salary=" + salary + '}';
    }

    @Override //глубокое клонирование
    public Person clone() {
        Adress adress = new Adress(this.adress.getCity(), this.adress.getStreet(), this.adress.getZip());
        DNA dna = new DNA(this.dna.getPercentOfRace(), this.dna.getHromasome());
        Person person = new Person(name, age, dna, adress, salary);
        return person;
    }

 
    
}
