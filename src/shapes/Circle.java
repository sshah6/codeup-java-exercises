package shapes;

public class Circle {
    private double radius;
    double PI = Math.PI;

    public Circle(double theRadius){
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
