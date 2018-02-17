/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import dataIo.Product;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Cube
 */
public class Main {

    public static void main(String[] args) {

        Person person = new Person("Petja", 10202, "Petrov", new Date(2000 - 1900, 5, 12), 2000, true);
        Person person2 = new Person("Vasja", 60202, "Vasiljev", new Date(1940 - 1900, 1, 12), 1000, false);
        Person person3 = new Person("Dima", 10202, "Dmitriev", new Date(1550 - 1900, 5, 12), 9000, true);
        List<Person> people = Arrays.asList(person, person2, person3);
        
        
    

        // FileOutputStream fileOutputStream = new FileOutputStream("kuku.kura");
        // BufferedOutputStream bufferOutputStream = new BufferedOutputStream(fileOutputStream);
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("kuku.kura", true)))) {
            for (Person a : people) {
                String name = a.getName();
                int id = a.getId();
                String surname = a.getSurname();
                long dateOfBirth = a.getDateOfBirdth().getTime();
                Double salary = a.getSalary();
                boolean isMarried = a.isIsMarried();
                dataOutputStream.writeDouble(salary);
                dataOutputStream.writeUTF(name);
                dataOutputStream.writeUTF(surname);
                dataOutputStream.writeBoolean(isMarried);
                dataOutputStream.writeLong(dateOfBirth);
                dataOutputStream.writeInt(id);

            }
        } catch (FileNotFoundException b) {
        } catch (IOException c) {

        }

        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("kuku.kura")))) {
            try {
                while (true) {
                    double salary = dataInputStream.readDouble();
                    String name = dataInputStream.readUTF();
                    String surname = dataInputStream.readUTF();
                    boolean ismarried = dataInputStream.readBoolean();
                    Date dataOfBirth = new Date(dataInputStream.readLong());
                    int id = dataInputStream.readInt();
                    Person person1 = new Person(name, id, surname, dataOfBirth, salary, ismarried);
                    System.out.println(person1);
                }
            } catch (EOFException e) {

            }
            
        } catch (FileNotFoundException b) {
        } catch (IOException c) {

        }
    }
}
