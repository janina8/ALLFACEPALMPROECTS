/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kurs;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Cube
 */
public class Kurs {

    private String name;

    private int duration;
    private ArrayList<Student> students;
    private Date startDate;
    private Date endDate;
    private int minStudentCount;
    private int maxStudentCount;
    private String description;
    private boolean isStarted;

    public void addStudent(Student student) throws ToMuchStudentsException {

        if (students.size() > maxStudentCount) {
            throw new ToMuchStudentsException();
        }

        students.add(student);

    }

    public Kurs(String name, int duration, Date startDate, Date endDate, int minStudentCount, int maxStudentCount, String description, boolean isStarted) {
        this.name = name;
        this.duration = duration;
        this.students = new ArrayList<>();
        this.startDate = startDate;
        this.endDate = endDate;
        this.minStudentCount = minStudentCount;
        this.maxStudentCount = maxStudentCount;
        this.description = description;
        this.isStarted = isStarted;
    }

    public void start() throws ToLowStudentsException, KursIsStarted {

        if (isStarted == true) {
            throw new KursIsStarted();
        }

        if (students.size() < minStudentCount) {
            throw new ToLowStudentsException();
        }
        isStarted = true;
    }

    public void breakKurs() {
        isStarted = false;
    }

    @Override
    public String toString() {
        return   name;
    }
    

}
