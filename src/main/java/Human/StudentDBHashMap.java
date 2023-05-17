package Human;

import java.util.*;

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
    
//    public Student randomStudent(){
//
//
//        List<Map.Entry<String, Student>> arrayList = new ArrayList<>(studentMap.entrySet());
//
//        Random random= new Random();
//        int randomIndex= random.nextInt(studentMap.size());
//
//        List<String> keysList = new ArrayList<>(studentMap.keySet());
//
//        return arrayList.get(keysList.get(randomIndex));
//
//
//    }

    

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
