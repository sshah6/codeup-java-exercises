package shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("Area of Rectangle: " + box1.getArea());
//        System.out.println("Perimeter of Rectangle: " + box1.getPerimeter());
//
//        //Making a varaible of Rectangle but assigning to the instance of square, because square is a child of the rectangle
//        Rectangle box2 = new Square(5);
//        System.out.println("Area of Square: " + box2.getArea());
//        System.out.println("Perimeter of Square: " + box2.getPerimeter());

        //###Abstract Exercise below
        Measurable myShape = new Rectangle(6, 5);
        System.out.println("Rectangle Prem: " + myShape.getPerimeter());
        System.out.println("Rectangle Area:  " + myShape.getArea());

        Measurable square =  new Square(6);
        System.out.println("Square prem: " + square.getPerimeter());
        System.out.println("Square prem: " + square.getArea());

        //once we override the getlength in Measurable it gets the length
        System.out.println(myShape.getlength());
        //It does not read the getLength directly, becasue we access type measurable here

        //Or we can explicitly cast it to
        Rectangle r = (Rectangle) myShape;

    }
}
