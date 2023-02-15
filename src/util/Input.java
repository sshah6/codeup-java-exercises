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
        System.out.println("Enter String y/n.");
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
        System.out.println("Eneter a number between " + min +  " and "  + max + "\n");
        userMinMax = scanner.nextInt();
        if(userMinMax > max || userMinMax  < min){
            return getInt(min, max);
        } else{
            return this.userMinMax;
        }
    }

    int getInt(){
        return this.userMinMax;
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a decimal number between " + min + " max " + max + "\n");
        doubleMinMax = scanner.nextDouble();
        if(doubleMinMax > max || doubleMinMax < min){
            return getDouble(min, max);
        }else{
            return doubleMinMax;
        }
    }

    public double getDouble(){
        return doubleMinMax;
    }

}
