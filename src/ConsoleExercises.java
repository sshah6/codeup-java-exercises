import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n", pi);

        // System.out.println("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // System.out.println(number);

        // System.out.println("Enter three words: ");
        // String First = sc.nextLine();
        // String Second = sc.nextLine();
        // String Third = sc.nextLine();

        // System.out.println(First);
        // System.out.println(Second);
        // System.out.println(Third);

        // System.out.println("Enter a sentnece: ");
        // String input = sc.nextLine();
        // System.out.println(input);

        // System.out.println("Enter the width and length of the class: ");
        // String Width = sc.nextLine();
        // String Length = sc.nextLine();

        // int width = Integer.parseInt(Width);
        // int length = Integer.parseInt(Length);

        // // System.out.println(width);
        // // System.out.println(length);

        // int Area = width * length;
        // int Perimeter = 2 * (length + width);

        // System.out.println(Area + " Area");
        // System.out.println(Perimeter + " Perimeter");


        // System.out.println("Enter the width and length of the class: ");
        // String Width = sc.nextLine();
        // String Length = sc.nextLine();

        // float width = Float.parseFloat(Width);
        // float length = Float.parseFloat(Length);

        // // System.out.println(width);
        // // System.out.println(length);

        // float Area = width * length;
        // float Perimeter = 2 * (length + width);

        // System.out.println(Area + " Area");
        // System.out.println(Perimeter + " Perimeter");

        sc.useDelimiter("\n");
        System.out.println("Enter the width and length of the class: ");
        int Width = sc.nextInt();
        int Length = sc.nextInt();

        int Area = Width * Length;
        int Perimeter = 2 * (Length + Width);

        System.out.println(Area + " Area");
        System.out.println(Perimeter + " Perimeter");
    }
}
