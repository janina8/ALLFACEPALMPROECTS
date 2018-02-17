/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultySorting;
import java.util.Date;

/**
 *
 * @author Cube
 */
public class Person implements  Comparable<Person>{
    
    private String name;
    private String surname;
    private double salary;
    private Date dateOfBirth;
    private int id;
    private Adress adress;
    private boolean isMarried;

    public Person(String name, String surname, double salary, Date dateOfBirth, int id, Adress adress, boolean isMarried) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.adress = adress;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public Adress getAdress() {
        return adress;
    }

    public boolean isIsMarried() {
        return isMarried;
    }
    
    

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", surname=" + surname + ", salary=" + salary + ", dateOfBirth=" + dateOfBirth + ", id=" + id + ", adress=" + adress + ", isMarried=" + isMarried + '}';
    }

 //   @Override
 //   public int compareTo(Person o) {
        //Если объект, на котором будет вызваться этот метод меньше (с нашей точки зрения), то результат возвращается с знаком "-"
        //Если объект, на котором будет вызваться этот метод больше (с нашей точки зрения), то результат возвращается с знаком "+"
        //Если объект, на котором будет вызваться этот метод равен (с нашей точки зрения), то результат возвращается с знаком "0"
        //return  this.id - o.getId();
  //     return Integer.compare(id, o.getId());
  //  }

   /*@Override
    public int compareTo(Person o) {
        //Если объект, на котором будет вызваться этот метод меньше (с нашей точки зрения), то результат возвращается с знаком "-"
        //Если объект, на котором будет вызваться этот метод больше (с нашей точки зрения), то результат возвращается с знаком "+"
        //Если объект, на котором будет вызваться этот метод равен (с нашей точки зрения), то результат возвращается с знаком "0"
        //return  this.id - o.getId();
       return Double.compare(salary, o.getSalary());
    }
*/
   /* @Override
    public int compareTo(Person o) {
        //Если объект, на котором будет вызваться этот метод меньше (с нашей точки зрения), то результат возвращается с знаком "-"
        //Если объект, на котором будет вызваться этот метод больше (с нашей точки зрения), то результат возвращается с знаком "+"
        //Если объект, на котором будет вызваться этот метод равен (с нашей точки зрения), то результат возвращается с знаком "0"
        //return  this.id - o.getId();
       return Boolean.compare(isMarried, o.isIsMarried());
    }
    */
    
   /*    @Override
    public int compareTo(Person o) {
        //Если объект, на котором будет вызваться этот метод меньше (с нашей точки зрения), то результат возвращается с знаком "-"
        //Если объект, на котором будет вызваться этот метод больше (с нашей точки зрения), то результат возвращается с знаком "+"
        //Если объект, на котором будет вызваться этот метод равен (с нашей точки зрения), то результат возвращается с знаком "0"
        //return  this.id - o.getId();
       return this.name.compareTo(o.getName());
    }
*/
//    @Override
//    public int compareTo(Person o) {
//        //Если объект, на котором будет вызваться этот метод меньше (с нашей точки зрения), то результат возвращается с знаком "-"
//        //Если объект, на котором будет вызваться этот метод больше (с нашей точки зрения), то результат возвращается с знаком "+"
//        //Если объект, на котором будет вызваться этот метод равен (с нашей точки зрения), то результат возвращается с знаком "0"
//        //return  this.id - o.getId();
//       return this.dateOfBirth.compareTo(o.getDateOfBirth());
//    } 
//    

   
    public int compareTo(Person o) {
        //Если объект, на котором будет вызваться этот метод меньше (с нашей точки зрения), то результат возвращается с знаком "-"
        //Если объект, на котором будет вызваться этот метод больше (с нашей точки зрения), то результат возвращается с знаком "+"
        //Если объект, на котором будет вызваться этот метод равен (с нашей точки зрения), то результат возвращается с знаком "0"
        //return  this.id - o.getId();
        int result = this.surname.compareTo(o.getSurname());
        if(result != 0) return result;
        result = this.name.compareTo(o.getName());
        if(result != 0) return result;
        result = Double.compare(salary, o.getSalary());
        if(result != 0) return result;
        result = this.dateOfBirth.compareTo(o.getDateOfBirth());
        if(result != 0) return result;
        result = Integer.compare(id, o.getId());
        if(result != 0) return result;
        result =Integer.compare(this.adress.getHomeNubmer(), o.getAdress().getHomeNubmer());
        if(result != 0) return result;
        result = Boolean.compare(this.isIsMarried(), o.isIsMarried());
        
       return result;
    } 
    
}