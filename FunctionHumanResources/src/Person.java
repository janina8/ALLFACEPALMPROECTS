
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cube
 */
public abstract class Person {

    private final String firstName;
    private final String surname;
    private final Date dateOfBirth;
   // private double age;

    protected Person(String firstName, String surname, Date dateOfBirth, double age) {
        this.firstName = firstName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return (int)((new Date().getTime() - dateOfBirth.getTime())/(365L*24L*60L*60L*1000L));

    }


}
