/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Barber barber = new Barber("Petj999a ", 666);
        Student student = new Student("MGU", "Vasja ", 555);
        Human student1 = new Student("MGU", "Chicken ", 555);
        Person student7 = new Student("MGU", "Ola ", 555);
        Musician student3 = new Student("MGU", "Дима ", 555);

        
        Human human = new Human("Ala");
        Person person = new Person("Kokoko", 51);

        PartTimeStudent partTimeStudent = new PartTimeStudent("Kakojta vuz", "David ", 6544);
        //    MusicBand musicBand = new MusicBand();
        //     musicBand.addMusician(barber);
        //     musicBand.addMusician(student);

        //     musicBand.addMusician(partTimeStudent);
        //    musicBand.performe();
        Gym gym = new Gym();
        gym.addPerson(student);
        Student student6 = new Student("Harvard", "Petja ", 0);
        gym.addPerson(student6);
        Student student18 = (Student)student7;
        student18.study();
        gym.addPerson((Sportsman) student1);
        gym.addPerson((Sportsman) student7);
        gym.addPerson((Sportsman) student3);
        if(barber instanceof Sportsman)
             gym.addPerson((Sportsman)barber);
        gym.addPerson(partTimeStudent);
     
        gym.competitions();
        gym.competitions();
       
    }
    
}

