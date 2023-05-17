package Human;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class StudentDBHashMap {

    private Map<String, Student> studentMap= new HashMap<>();

    public StudentDBHashMap(Map<String, Student> studentMap) {
        this.studentMap = studentMap;
    }

    public Map<String, Student> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<String, Student> studentMap) {
        this.studentMap = studentMap;
    }

    public Student findById(int id) throws StudentNotFoundException {
        for (Student anyStudent : studentMap.values()) {
            if (anyStudent.getStudentID() == id) {
                return anyStudent;
            }
        }
        throw new StudentNotFoundException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDBHashMap that = (StudentDBHashMap) o;
        return Objects.equals(studentMap, that.studentMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentMap);
    }
}
