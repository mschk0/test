package FH;
import PersonPackage.Address;
import StudentPackage.Student;
import StudentManagment.StudentManagment;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CourseOfStudy {
    private String course;
    private String semester;
    private StudentManagment students;

    public CourseOfStudy(String course, String semester, StudentManagment students) {
        this.course = course;
        this.semester = semester;
        this.students = students;
    }

    public CourseOfStudy(String course, String semester) {
        this.course = course;
        this.semester = semester;
    }

    public void setStudents(StudentManagment students){

    }
    public int getTotalStudents() {
        return students.getStudents().size();
    }
    // average grade < 1.6
    public List<Student> getExcellentStudents(){
        return students.getExcellentStudents();
    }
    //hat mindenstens ein 5
    public List<Student> getFailedStudents(){
         List<Student> failedStudents = new ArrayList<>();
         for(Student student : students.getStudents().values()){
             if(student.isBadStudent()){
                 failedStudents.add(student);
             }
         }
         return failedStudents;
    }

    public void printAllStudentData() {
        for (Student student : students.getStudents().values()) {
            student.printStudentData();
        }
    }

}
