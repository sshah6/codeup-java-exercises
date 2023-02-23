package grades;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {

    public static void main(String[] args) {

        Map<String, Student> students = new HashMap<>();

        Student student = new Student("Alex", new ArrayList<>(Arrays.asList(12, 16, 20)));
        Student student1 = new Student("Alan", new ArrayList<>(Arrays.asList(10, 22, 25)));
        Student student2 = new Student("Ali", new ArrayList<>(Arrays.asList(30, 33, 35)));
        Student student3 = new Student("Alexis", new ArrayList<>(Arrays.asList(40, 44, 45)));

        students.put("alexprog2", student);
        students.put("alancoder11", student1);
        students.put("alijava34", student2);
        students.put("alexis420", student3);
//        System.out.println(students);

        Set<String> keys = students.keySet();

        double total = 0;
        double Ave = 0;
        int count = 0;
        for(int grades: student.getGrades()){
            total += grades;
            count++;
        }
        Ave = total / count;


        System.out.printf("Welcome \n Here are github usernames of students: %s \nFor students all grades type (all)\nFor overall grade average type(allAve)\nOr Which student would you like more info about: ", keys);

        boolean goOn = true;
        Scanner sc = new Scanner(System.in);

        do{
            String input = sc.next();
            if(input.equalsIgnoreCase("all")) {
                students.forEach((theKey, value) -> {
                    System.out.println(theKey + ":" + value.getGrades());
                });
            }
            for(String key: keys){
                if(input.equalsIgnoreCase(key)){
                    System.out.println("Student name: " + students.get(key).getName());
                    System.out.println("Student's GITHUB key: " + key);
                    System.out.println("Student grades are: " + students.get(key).getGrades());
                    System.out.println("Student grade Ave: "+ students.get(key).getGradeAverage());
                }else if(input.equalsIgnoreCase("allave")){
                    System.out.println(Ave);
                }
            }

            System.out.println("do you wanna continue? y/n");
            String confirm = sc.next();
            if(confirm.equalsIgnoreCase("n")){
                System.out.println("Goodbye! Have a good day.");
                goOn = false;
            }else{
                System.out.printf("Welcome \n Here are github usernames of students: %s \nFor students all grades type (all):\nOr Which student would you like more info about: ", keys);
            }

        }while(goOn);
    }

}
