package util;
import java.util.Scanner;

public class Input{

    private Scanner scanner;
    public Input(){
        scanner = new Scanner(System.in);
    }

    private String stringInput;
    private boolean boolInput;
    private int userMinMax;
    private double doubleMinMax;

    public String getString() {
//        System.out.println("Enter String y/n.");
        System.out.println("Enter a number or integer 1 - 10 to see the error: ");
        stringInput = scanner.nextLine();
        return this.stringInput;
    }


    public boolean yesNo() {
        String stringInput = getString();
        if(stringInput.startsWith("y")){
            boolInput =  true;
        }else{
            boolInput =  false;
        }
        return this.boolInput;
    }

    public int getInt(int min, int max){
//        System.out.println("Eneter a number between " + min +  " and "  + max + "\n");
//        userMinMax = scanner.nextInt(); //instead of this i put the below code
        try {
            userMinMax = Integer.parseInt(stringInput);
            if(userMinMax > max || userMinMax  < min){
                return getInt(min, max);
            } else{
                return this.userMinMax;
            }
        }catch(NumberFormatException nfe){
            System.out.println("Error: You did not enter a integer type: " + nfe);
        }
        return this.userMinMax;
    }

    int getInt(){
        return this.userMinMax;
    }

    public double getDouble(double min, double max){
//        System.out.println("Enter a decimal number between " + min + " max " + max + "\n");
//        doubleMinMax = scanner.nextDouble();  //instead of double we use the getstring input
        try {
            doubleMinMax = Double.parseDouble(stringInput);
            if(doubleMinMax > max || doubleMinMax < min){
                return getDouble(min, max);
            }else{
                return doubleMinMax;
            }
        }catch(NumberFormatException nfe){
            System.out.println("Error: You did not enter a double type: " + nfe);
        }
        return this.doubleMinMax;
    }


    public double getDouble(){
        return doubleMinMax;
    }

}
