package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("Area of Rectangle: " + box1.getArea());
        System.out.println("Perimeter of Rectangle: " + box1.getPerimeter());

        //Making a varaible of Rectangle but assigning to the instance of square, because square is a child of the rectangle
        Rectangle box2 = new Square(5);
        System.out.println("Area of Square: " + box2.getArea());
        System.out.println("Perimeter of Square: " + box2.getPerimeter());
    }
}
