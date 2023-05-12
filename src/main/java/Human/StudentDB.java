package Human;

import java.util.Arrays;

public class StudentDB {

    private Student[] Students;

    public StudentDB(Student[] Students) {
        this.Students = Students.clone();
    }

    public Student[] getStudents() {
        return Students;
    }

    public Student findById(int id) throws StudentNotFoundException {
        for (int i = 0; i< Students.length; i++){
            if (Students[i].getStudentID()==id){
                return Students[i];
            }
        }
        throw new StudentNotFoundException();
    }




    public void setStudents(Student[] Students) {
        this.Students = Students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(Students);
    }

    public Student[] getAllStudents(){
        return getStudents();
    }

    public Student randomStudent(){
        int randomStudent = (int) (Math.random()* Students.length+1);
        return Students[randomStudent];
    }


}