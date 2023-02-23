package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> grades = new ArrayList<>();

    public Student(String name, List<Integer> grades){
        this.name = name;
        this.grades = grades;
    }

    public String getName(){
        return name;
    }

    public void addGrade(int grade){
//        System.out.println(grades);
        grades.add(grade);
    }

    public double getGradeAverage(){
        //return the grades average
        double sum = 0;
        for(int grade: grades){
            sum += grade;
        }
        return sum / grades.size();
    }

    public List<Integer> getGrades(){
        return grades;
    }

}

