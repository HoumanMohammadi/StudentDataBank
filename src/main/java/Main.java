import Human.ComputerScienceStudent;
import Human.StudentDB;
import Human.StudentNotFoundException;

import java.util.Arrays;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

     /*   Students[] studentsArray = new Students[3];
        studentsArray[0] = new Students("Houman", 1234);
        studentsArray[1] = new Students("Gerd", 12345);
        studentsArray[2] = new Students("Zied", 12346);

        StudentDB studentDataBank = new StudentDB(studentsArray);

        System.out.println(studentDataBank);
        System.out.println(Arrays.toString(studentDataBank.getAllStudents()));
        System.out.println(studentDataBank.randomStudent());*/

        ComputerScienceStudent[] computerScienceStudent= new ComputerScienceStudent[3];
        computerScienceStudent[0]= new ComputerScienceStudent("Houman", 1, true);
        computerScienceStudent[1]= new ComputerScienceStudent("Natthias", 22, true);
        computerScienceStudent[2]= new ComputerScienceStudent("Zied", 333, true);
        StudentDB studentDataBank = new StudentDB(computerScienceStudent);
        System.out.println(Arrays.toString(computerScienceStudent));

        try {
            System.out.println(studentDataBank.findById(22));
        } catch (StudentNotFoundException e) {
            System.out.println("ID nicht existiert");;
        }
        System.out.println("Es wird nichts ausgegeben werden");

        System.out.println();

    }

}