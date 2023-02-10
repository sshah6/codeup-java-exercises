import java.io.PrintStream;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");

        //Second Ex
        int myFavoriteNumber = 56;
        System.out.println(myFavoriteNumber);

        String myString = "Testing the variable";
        System.out.println(myString);

        // String myString = 'T';
        // System.out.println(myString); //Incompatible types

        // long myNumber = 3.14;
        // System.out.println(myNumber); //different types

        // long myNumebr = 123;
        // System.out.println(myNumebr);

        float myNumber = 3.14F;
        System.out.println(myNumber);

        // int x = 5;
        // System.out.println(x++);
        // System.out.println(x);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        // String class = "class"; //I think class is a build in method.
        // System.out.println(class);

        // String theNumberThree = "three";
        // Object o = theNumberThree;
        // int three = (int) o; //string type cannot be casted into integer type

        // int x = 4;
        // x = x + 5;

        int a = 4;
        a += 5;
        System.out.println(a);

        // int x = 3;
        // int y = 4;
        // y = y * x;

        int three = 3;
        int four = 4;
        four *= three;
        System.out.println(four);

        // int x = 10;
        // int y = 2;
        // x = x / y;
        // y = y - x;

        int ten = 10;
        int two = 2;
        ten /= two;
        two -= ten;
        System.out.println(ten);
        System.out.println(two);

        // byte number = 130;
        // System.out.println(number); //types do not much
    }
}
