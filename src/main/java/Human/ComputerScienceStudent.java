package Human;

import java.util.Objects;

public class ComputerScienceStudent extends Student implements Citizen {

    private boolean gender;

    @Override
    public String getAdress() {
        return null;
    }

    @Override
    public int getIdentityCardNumber() {
        return 0;
    }



    public ComputerScienceStudent(String studentName, int studentID, boolean gender) {
        super(studentName, studentID);
        this.gender=gender;

    }

    public boolean isGender() {
        return gender;
    }



    public void setGender(boolean gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "gender=" + gender +
                "student name= "+getStudentName()+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ComputerScienceStudent that = (ComputerScienceStudent) o;
        return gender == that.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gender);
    }
}
