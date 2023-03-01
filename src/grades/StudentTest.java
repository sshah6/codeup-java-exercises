package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("alex", new ArrayList<>(Arrays.asList(12, 16, 20)));
//        Student student1 = new Student("alan", new ArrayList<>(Arrays.asList(10, 22, 25)));
//        Student student2 = new Student("ali", new ArrayList<>(Arrays.asList(30, 33, 35)));
//        Student student3 = new Student("alexis", new ArrayList<>(Arrays.asList(40, 44, 45)));
        student.addGrade(25);
        student.addGrade(217);
        System.out.println("Student name is: "+student.getName());
        System.out.println("Average of grades is: "+student.getGradeAverage());

    }
}
