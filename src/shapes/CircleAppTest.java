package shapes;
import java.util.Scanner;

public class CircleAppTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius for circle to get specs: ");
        int circleRadius = sc.nextInt();
        CircleApp app = new CircleApp(circleRadius);
        System.out.printf("The Area of Circle is: %.2f \n", app.getArea());
        System.out.printf("The circumference of the Circle is: %.2f  ", app.getCircumference());
    }
}
