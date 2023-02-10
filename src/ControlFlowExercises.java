import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
        //(1)
        // int i = 5;
        // while( i <= 15){
        //     System.out.print(i);
        //     i++;
        // }
        // System.out.println();

        //(2)
        // int j = 0;
        // do{
        //     System.out.println(j);
            // j += 2;
        // }while( j <= 100);

        //(3)
        // int j = 100;
        // do{
        //     System.out.println(j);
        //     j -= 5;
        // }while( j >= -10);

        //(4)
        // int k = 2;
        // do{
        //     System.out.println(k);
        //     int result =  (int) Math.pow(k, 2);
        //     k = result;     
        // }while(k < 1000000);

        //(5)
        // for(int p = 0; p <= 100; p+=2){
        //     System.out.println(p);
        // }

        //(6)
        // for(int s = 100; s >= -10; s-=5){
        //     System.out.println(s);
        // }

        //(7)
        // for(long x = 2; x < 1000000; x*=x){
        //      System.out.println(x);      
        // }

        //(8)
        // for(int y = 1; y <= 100; y++){
        //     // System.out.println(y);
        //     if(y % 3 == 0 && y % 5 == 0){
        //         System.out.println("Fizz Buzz");
        //     }else if(y % 5 == 0){
        //         System.out.println("Buzz");
        //     }else if(y % 3 == 0){
        //         System.out.println("Fizz");
        //     }else{
        //         System.out.println(y);
        //     }
        // }

        //(9)
         Scanner sc = new Scanner(System.in);
        System.out.print("What number would you like to go to: ");
        int input = sc.nextInt();
        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for(int a = 1; a <= input; a++){
            int theNumber = a;
            int square = (int) Math.pow(a, 2);
            int cube = (int)Math.pow(a, 3);
            System.out.printf("%-5d  | %-5d   | %-5d \n", theNumber, square, cube);
        }

        //(10)
        // System.out.print("Eneter a grade betwen 0 - 100: ");
        // int grade = sc.nextInt();
        // if(grade >= 88 && grade <= 100){
        //     System.out.println("A");
        // }else if( grade >= 80 && grade <= 87){
        //     System.out.println("B");
        // }else if(grade >= 67 && grade <= 79){
        //     System.out.println("C");
        // }else if(grade >= 60 && grade <= 66){
        //     System.out.println("D");
        // }else{
        //     System.out.println("F");
        // }



    }
}
