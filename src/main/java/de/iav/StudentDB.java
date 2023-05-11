package de.iav;

import java.util.Arrays;

public class StudentDB {

    private Students[] students;

    public StudentDB(Students[] students) {
        this.students = students.clone();
    }

    public Students[] getStudents() {
        return students;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students);
    }

    public Students[] getAllStudents(){
        return getStudents();
    }

    public Students randomStudent(){
        int randomStudent = (int) (Math.random()* students.length+1);
        return students[randomStudent];
    }


}