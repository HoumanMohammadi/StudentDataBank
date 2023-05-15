import Animal.PassportPrintingService;
import Animal.Pet;
import Human.*;

import java.util.Arrays;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student[] studentsArray = new Student[3];
        studentsArray[0] = new Student("Houman", 1234);
        studentsArray[1] = new Student("Gerd", 12345);
        studentsArray[2] = new Student("Zied", 12346);

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

        for (int i=0; i< computerScienceStudent.length;i++){
            PassportPrintingService<ComputerScienceStudent[]>  computerScienceStudentPassportPrintingService= new PassportPrintingService<>(computerScienceStudent);
            computerScienceStudentPassportPrintingService.printPassport();
        }


        PassportPrintingService<Student> studentPassportPrintingService= new PassportPrintingService<>(studentsArray[2]);
        studentPassportPrintingService.printPassport();

        PassportPrintingService<Pet> petPassportPrintingService=new PassportPrintingService<>(new Pet("Batzi"));
        petPassportPrintingService.printPassport();


    }

}