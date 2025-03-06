package StudentPackage;

import PersonPackage.Address;
import PersonPackage.Person;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private List<Integer> grades;


    public Student(String firtname, String lastname, int age, int svn , Address address) {
        super(firtname, lastname, age, svn, address);
        grades = new ArrayList<>();
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }
    public boolean isBadStudent(){
        return grades.contains(5);
    }

    public double getAverageGrade(){
        if(isBadStudent()){
            return 5;
        }
        else {
            int sum = 0;
            for(Integer grade : grades){
                sum += grade;
            }
            return (double)sum / grades.size();
        }

    }
    public void outGrades(){
        grades.forEach(System.out :: println);
    }
    public void printStudentData() {
        System.out.println("Firstname: " + getFirstname());
        System.out.println("Lastname: " + getLastname());
        System.out.println("Age: " + getAge());
        getAddress().printAddressData();
        System.out.print("Grades: ");
        for (Integer grade : grades) {
            System.out.println(grade + " ");
        }
    }
}
