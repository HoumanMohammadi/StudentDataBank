package de.iav;
import de.iav.StudentDB;

import java.util.Arrays;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Students[] studentsArray = new Students[3];
        studentsArray[0] = new Students("Houman", 1234);
        studentsArray[1] = new Students("Gerd", 12345);
        studentsArray[2] = new Students("Zied", 12346);

        StudentDB studentDataBank = new StudentDB(studentsArray);

        System.out.println(studentDataBank);
        System.out.println(Arrays.toString(studentDataBank.getAllStudents()));
        System.out.println(studentDataBank.randomStudent());
    }

}