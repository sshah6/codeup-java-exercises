import java.util.Scanner;

public class Bob{
    public static void main(String[] args){
    boolean stop = true;
        do{
            System.out.print("Ask, yell or say nothing to Bob: ");
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();
                // int length = userInput.length;
            if(userInput.endsWith("?")){
                System.out.println("Sure");
            }else if(userInput.endsWith("!")){
                System.out.println("Whoa, chill out!");
            }else if(userInput.isEmpty() == true){
                System.out.println("Fine. Be that way!");
            }else if(userInput.equals("bye")){
                stop = false;
            }else{
                System.out.println("Whatever.");
            }
        }while(stop);
    }
}
