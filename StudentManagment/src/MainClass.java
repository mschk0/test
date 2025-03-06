import PersonPackage.Address;
import StudentPackage.Student;
import StudentManagment.StudentManagment;

public class MainClass {
    public static void main(String[] args) {

        Address a1 = new Address("Austria", "Pregarten" , 4230, "Grünbichl", "20/2");

        Student s1 = new Student("Hazret", "Dizdarevic",26,666 ,a1);
        s1.addGrade(2);
        s1.addGrade(1);
        s1.addGrade(4);
        s1.addGrade(3);
        s1.addGrade(1);
        s1.addGrade(4);

        System.out.println(s1.isBadStudent());

        System.out.println("Average Grade: " + s1.getAverageGrade());

    }
}
