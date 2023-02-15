package shapes;

import java.util.Scanner;

public class CircleApp {

        Scanner sc = new Scanner(System.in);

        private double radius;
        double PI = Math.PI;

        public CircleApp(double theRadius){
            this.radius = theRadius;
        }

        public double getArea(){
            double area = PI * (radius * radius);
            return area;
        }
        public double getCircumference(){
            double circufrence = 2 * PI * radius;
            return circufrence;
        }
}
