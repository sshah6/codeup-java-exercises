import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class MethodExercises {
//(1)
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

    
           // TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
        //  a greeting message to the user by either their first or first and last name.

        // example: sayName("Justin") - "Hi Justin"
        // example: sayName("Justin", "Reich") - "Hi Justin Reich"

        // public static String sayHi(String name){
        //     return "Hello " + name;
        // }
        // public static String sayHi(String greeting, String name){
        //     return greeting + name;
        // }

        // TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles

        // public static int add(int num1, int num2) {
        //     return num1 + num2;
        // }

        // public static double add(double num1, double num2){
        //     return num1 + num2;
        // }


//(2) Resursion 
        // public static int getInteger(int min, int max){
        //     System.out.println("Enter an integer between 1 and 10: ");
        //     Scanner sc = new Scanner(System.in);
        //     int userInput = sc.nextInt();

        //     if(userInput > max || userInput < min ){
        //         return getInteger(min, max);    //as long as the condition is met, the recursion is happening (by calling the method over and over)
        //     }
        // return userInput;
        // }


//FACTORIAL IN RECUSRSION
        // public static long factorial(int input){
        //    if(input == 0){ // when it hit zero, it returns 1, if return zero, 
        //         //zero will be timed to result and make eveything zero
        //         return 1;  
        //    }else{
        //         return input *= factorial(input - 1);
        //    }        
        // }
//(3)
//#### FACTORIAL start#####
        // public static void factorial(int input){
        //     long result = 1;
        //     if (input < 1 || input > 10){
        //         System.out.println("number out of range!");
        //         return;
        //     }else{
        //         for(int i = 1; i <= input; i++){
        //             result *= i;       
        //         }    
        //     }
        //     System.out.printf("factorial of %d is %d.\n", input, result);     
        // }
//####    FACTORIAL finish    #####

//(4) ### DICE ROLL ######
        // public static void diceRoll(int sideNum1, int sideNum2){
        //     Random random = new Random();
        //     int firstNum = random.nextInt(sideNum1) + 1;
        //     int secondNum = random.nextInt(sideNum2) + 1;
        //     System.out.println("first dice: " + firstNum + " second dice: " + secondNum);
        // }



    public static void main(String[] args) {
        // System.out.println(Add(5, 4));
        // System.out.println(Minus(10, 3));
        // System.out.println(Times(10, 0));
        // System.out.println(Divide(10, 0));
        // System.out.println(Remainder(10, 3));
        // System.out.println(Multiply(10, 3));
        // System.out.println(recursiveTimes(3, 3));
        // System.out.println(sayHi("Alex"));
        // System.out.println(sayHi("whats up? ", "Alex"));
        // System.out.println(add(1, 3));
        // System.out.println(add(1.0, 3.5));

       Scanner sc = new Scanner(System.in);

//(2)
//        System.out.println(getInteger(1, 10)); 
        // System.out.println(factorial(getInteger(1, 10)));

       // =========> DICE ROLL below
    //    System.out.println("Eneter the number of your desired dice sides: ");
    //    int diceOne = sc.nextInt();
    //     int diceTwo = sc.nextInt();
    //     diceRoll(diceOne, diceTwo);

    //#### FACTORIAL start#####
    // System.out.println("Please, enter a number between 1 and 10: ");
    // int input = sc.nextInt();
    // factorial(input);
    // boolean goOn = true;
    // do{
    //     System.out.println("Do you wish to continue: y/n");
    //     String permission = sc.next(); 
    //     if(permission.equals("y")){
    //         System.out.println("Please, enter a number between 1 and 10: ");
    //         int input2 = sc.nextInt();
    //         factorial(input2);
    //     }else{
    //         goOn = false;
    //     }
    // }while(goOn);
    //####### FACTORIAL finish ##########
  
    }    
}
