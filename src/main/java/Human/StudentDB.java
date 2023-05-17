package Human;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDB {

    //private Student[] Students;

    private List<Student> students= new ArrayList<>();

    public StudentDB(List<Student> students) {
        this.students = students;
    }

    public StudentDB() {
    }

    public void add(Student student){
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

        public Student findById(int id) throws StudentNotFoundException {
            for (Student anyStudent : students) {
                if (anyStudent.getStudentID() == id) {
                    return anyStudent;
                }
            }
            throw new StudentNotFoundException();
        }


//        for (int i = 0; i< students.length; i++){
//            if (students[i].getStudentID()==id){
//                return students[i];
//            }
//        }
//        throw new StudentNotFoundException();
//    }



    //    public StudentDB(Student[] Students) {
//        this.students = Students.clone();
//    }
//
//    public Student[] getStudents() {
//        return students;
//    }
//
//    public Student findById(int id) throws StudentNotFoundException {
//        for (int i = 0; i< students.length; i++){
//            if (students[i].getStudentID()==id){
//                return students[i];
//            }
//        }
//        throw new StudentNotFoundException();
//    }
//
//
//
//
//    public void setStudents(Student[] Students) {
//        this.students = Students;
//    }
//
//    @Override
//    public String toString() {
//        return "StudentDB{" +
//                "students=" + Arrays.toString(students);
//    }
//
//    public Student[] getAllStudents(){
//        return getStudents();
//    }
//
//    public Student randomStudent(){
//        int randomStudent = (int) (Math.random()* students.length+1);
//        return students[randomStudent];
//    }


}