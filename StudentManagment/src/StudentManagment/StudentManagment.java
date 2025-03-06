package StudentManagment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import StudentPackage.Student;
import PersonPackage.Address;
import StudentPackage.Student;


public class StudentManagment {


    Map<Integer, Student> students;

    public StudentManagment(Map<Integer, Student> students) {
        this.students = students;
    }
    public Map<Integer, Student> getStudents() {
        return students;
    }
    public void addStudent(Student student){
        students.put(student.getSvn(),student);
    }
    public List<Student> getAllGoodStudent(){
        List<Student> goodStudent = new ArrayList<>();
        for(Map.Entry <Integer,Student> student : students.entrySet() ){
            if(!student.getValue().isBadStudent()){
                goodStudent.add(student.getValue());
            }
        }
        return goodStudent;
    }
    public List<Student> getAllAustrianStudent(){
        List<Student> AustrianStudent = new ArrayList<>();
        for(Student student : students.values() )
            if (student.getAddress().getCountry() == "Austria") {
                AustrianStudent.add(student);
            }
        return AustrianStudent;
    }
    public Student getStudentWithBestAverageGrade() {
        Student bstudent = null;
        double highAverage = 5;
        for (Student student : students.values()) {
            double avgGrade = student.getAverageGrade();
            if (avgGrade < highAverage) {
                highAverage = avgGrade;
                bstudent = student;
            }
        }

        return bstudent;
    }
    // average grade < 1.6

    public List<Student> getExcellentStudents() {
    List<Student> ExcellentStudents = new ArrayList<>();
    double highAverage = 1.6;
        for (Student student : students.values()) {
            double avgGrade = student.getAverageGrade();

            if (avgGrade < highAverage) {
                ExcellentStudents.add(student);
            }
        }
        return ExcellentStudents;
    }

}
