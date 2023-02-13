import java.util.Scanner;

public class MethodExercises {
    // public static int Add(int input1, int input2){
    //     return input1 + input2;
    // }

    // public static int Minus(int input1, int input2){
    //     return input1 - input2;
    // }

    // public static int Times(int input1, int input2){
    //     return input1 * input2;
    // }

    // public static double Divide(double input1, double input2){
    //     return input1 / input2;
    // }

    // public static int Remainder(int input1, int input2){
    //     return input1 % input2;
    // }

    // //Creating multiplication with a loop
    // public static int Multiply(int input1, int times){
    //     int result = 0;
    //     for(int i = 0; i < times; i++){
    //         result += input1;
    //     }
    //     return result;
    // }

    // //Creating muliplication with Recursion
    // public static int recursiveTimes(int input1, int input2){
    //     if(input2 == 0){
    //         return 0;
    //     }
    //     return input1 + recursiveTimes(input1, input2 - 1);
    // }

    // public static int getInteger(int min, int max){

    // }

           // TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
        //  a greeting message to the user by either their first or first and last name.

        // example: sayName("Justin") - "Hi Justin"
        // example: sayName("Justin", "Reich") - "Hi Justin Reich"

        public static String sayHi(String name){
            return "Hello " + name;
        }
        public static String sayHi(String greeting, String name){
            return greeting + name;
        }

        // TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles

        public static int add(int num1, int num2) {
            return num1 + num2;
        }

        public static double add(double num1, double num2){
            return num1 + num2;
        }


    public static void main(String[] args) {
        // System.out.println(Add(5, 4));
        // System.out.println(Minus(10, 3));
        // System.out.println(Times(10, 0));
        // System.out.println(Divide(10, 0));
        // System.out.println(Remainder(10, 3));
        // System.out.println(Multiply(10, 3));
        // System.out.println(recursiveTimes(3, 3));
        System.out.println(sayHi("Alex"));
        System.out.println(sayHi("whats up? ", "Alex"));
        System.out.println(add(1, 3));
        System.out.println(add(1.0, 3.5));

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter an integer between 1 - 10");
        // int input1 = sc.nextInt();

        // if()
        
    }    
}
