import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void guessGame(int random){ 
        
        boolean goOn = true;
        int count = 0;
        do{
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            count ++;
            if(input < random){
                System.out.println("HIGHER." + " Num of Guess: " + count);
            }else if(input > random){
                System.out.println("LOWER." + " Num of Guess: " + count);
            }else if(input == random){
                System.out.println("GOOD GUESS." + " Num of Guess: " + count);
                break;
            } 
        }while(goOn);   
    }
    public static void main(String[] args){
        System.out.println("Can you guess the number: ");
        Random random = new Random();
        int computerGuess = random.nextInt(100) + 1;
        guessGame(computerGuess);
    }
}
