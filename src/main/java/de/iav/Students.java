package de.iav;

import java.util.Objects;

public class Students {

    private String studentName;
    private int studentID;

    public Students(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentName='" + studentName + '\'' +
                ", studentID=" + studentID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return studentID == students.studentID && Objects.equals(studentName, students.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, studentID);
    }
}
